package com.team03.monew.articleCollect.service;

import com.team03.monew.article.dto.ArticleCreateRequest;
import com.team03.monew.article.service.ArticleService;
import com.team03.monew.interest.domain.Interest;
import com.team03.monew.articleCollect.domain.FilteredArticlesTask;
import com.team03.monew.articleCollect.event.ArticlesCollectedEvent;
import com.team03.monew.articleCollect.infrastructure.queue.ArticlesQueue;
import com.team03.monew.articleCollect.mapper.ArticlesMapper;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.time.Duration;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticlesConsumeService {

  private final ArticlesQueue articlesQueue;
  private final ArticleService articlesService;
  private final ArticlesMapper articlesMapper;
  private final ApplicationEventPublisher eventPublisher;
  private final MeterRegistry meterRegistry;

  private Thread consumerThread;
  private volatile boolean running = true;

  @PostConstruct
  public void startConsumerThread() {
    consumerThread = new Thread(this::consumeLoop, "articles-consumer-thread");
    consumerThread.setDaemon(true);
    consumerThread.start();
    log.info("Articles consumer thread started.");
  }

  @PreDestroy
  public void stopConsumerThread() {
    running = false;
    if (consumerThread != null) {
      consumerThread.interrupt();
    }
  }

  private void consumeLoop() {
    while (running) {
      try {
        long takeStartNs = System.nanoTime();
        FilteredArticlesTask task = articlesQueue.take();
        queueTakeWaitTimer().record(Duration.ofNanos(System.nanoTime() - takeStartNs));
        Timer.Sample sample = Timer.start(meterRegistry);

        try {
          // 1) 기사 저장 (매칭된 관심사 중 하나로 저장 시도)
          ArticleCreateRequest req = articlesMapper.toCreateRequest(task.article());
          var savedArticle = task.matchedInterests().stream()
              .map(Interest::getId)
              .map(interestId -> {
                try {
                  return articlesService.createArticle(req, interestId);
                } catch (Exception e) {
                  log.debug("기사 저장 스킵 (interestId={}): {}", interestId, e.getMessage());
                  return null;
                }
              })
              .filter(Objects::nonNull)
              .findFirst()
              .orElse(null);

          if (savedArticle == null) {
            consumeSkippedCounter().increment();
            log.debug("저장된 기사 없음 → 다음 작업으로 넘어갑니다");
            continue;
          }

          log.debug("기사 저장 완료: {}", savedArticle);
          // 2) 매칭된 관심사에서 id만 추출
          Set<UUID> interestIds = task.matchedInterests().stream()
              .map(Interest::getId)
              .collect(Collectors.toSet());

          var event = new ArticlesCollectedEvent(
              savedArticle.id(),
              interestIds
          );

          log.debug("기사 수집 이벤트 발행: {}", event);

          eventPublisher.publishEvent(event);
          publishedEventsCounter().increment();
          consumeSuccessCounter().increment();
        } catch (Exception processingError) {
          consumeFailureCounter().increment();
          throw processingError;
        } finally {
          sample.stop(consumeDurationTimer());
        }

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        running = false;
        return;
      } catch (Exception e) {
        log.error("기사 처리 중 오류 발생: {}", e.getMessage(), e);
        sleepQuietly(200); // 짧은 백오프로 과도한 루프 방지
      }
    }
  }

  private void sleepQuietly(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
      running = false;
    }
  }

  private Timer queueTakeWaitTimer() {
    return meterRegistry.timer("monew.queue.articles.take_wait");
  }

  private Timer consumeDurationTimer() {
    return meterRegistry.timer("monew.queue.articles.consume.duration");
  }

  private Counter consumeSuccessCounter() {
    return meterRegistry.counter("monew.queue.articles.consume.success.total");
  }

  private Counter consumeFailureCounter() {
    return meterRegistry.counter("monew.queue.articles.consume.failure.total");
  }

  private Counter consumeSkippedCounter() {
    return meterRegistry.counter("monew.queue.articles.consume.skipped.total");
  }

  private Counter publishedEventsCounter() {
    return meterRegistry.counter("monew.queue.articles.event.published.total");
  }
}
