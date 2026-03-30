package com.team03.monew.articleCollect.scheduler;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import java.util.concurrent.atomic.AtomicLong;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ArticleCollectMetricsReporter {

  private final MeterRegistry meterRegistry;

  private final AtomicLong lastAttempt = new AtomicLong(0);
  private final AtomicLong lastSuccess = new AtomicLong(0);
  private final AtomicLong lastFailure = new AtomicLong(0);
  private final AtomicLong lastQueuePublished = new AtomicLong(0);
  private final AtomicLong lastQueueTaken = new AtomicLong(0);

  @Scheduled(cron = "0 * * * * *")
  public void reportEveryMinute() {
    long attemptTotal = sumCounter("monew.rss.feed.attempt.total");
    long successTotal = sumCounter("monew.rss.feed.success.total");
    long failureTotal = sumCounter("monew.rss.feed.failure.total");
    long queuePublishedTotal = sumCounter("monew.queue.articles.publish.total");
    long queueTakenTotal = sumCounter("monew.queue.articles.take.total");
    double queueDepth = gaugeValue("monew.queue.articles.depth");

    long attemptDelta = attemptTotal - lastAttempt.getAndSet(attemptTotal);
    long successDelta = successTotal - lastSuccess.getAndSet(successTotal);
    long failureDelta = failureTotal - lastFailure.getAndSet(failureTotal);
    long queuePublishedDelta = queuePublishedTotal - lastQueuePublished.getAndSet(queuePublishedTotal);
    long queueTakenDelta = queueTakenTotal - lastQueueTaken.getAndSet(queueTakenTotal);

    double failureRate = attemptDelta > 0 ? (failureDelta * 100.0 / attemptDelta) : 0.0;

    log.info(
        "[RSS-METRICS-1M] feed(attempt={}, success={}, failure={}, failureRate={}%), "
            + "queue(published={}, taken={}, depth={})",
        attemptDelta,
        successDelta,
        failureDelta,
        String.format("%.2f", failureRate),
        queuePublishedDelta,
        queueTakenDelta,
        (int) queueDepth
    );
  }

  private long sumCounter(String metricName) {
    return Math.round(
        meterRegistry.find(metricName)
            .counters()
            .stream()
            .mapToDouble(Counter::count)
            .sum()
    );
  }

  private double gaugeValue(String metricName) {
    Gauge gauge = meterRegistry.find(metricName).gauge();
    return gauge != null ? gauge.value() : 0.0;
  }
}
