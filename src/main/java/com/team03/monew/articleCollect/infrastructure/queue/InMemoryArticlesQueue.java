package com.team03.monew.articleCollect.infrastructure.queue;

import com.team03.monew.articleCollect.domain.FilteredArticlesTask;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.springframework.stereotype.Component;

@Component
public class InMemoryArticlesQueue implements ArticlesQueue {

  private final BlockingQueue<FilteredArticlesTask> queue = new LinkedBlockingQueue<>();
  private final Counter publishCounter;
  private final Counter takeCounter;

  public InMemoryArticlesQueue(MeterRegistry meterRegistry) {
    Gauge.builder("monew.queue.articles.depth", queue, BlockingQueue::size)
        .description("Current depth of article processing queue")
        .register(meterRegistry);

    this.publishCounter = Counter.builder("monew.queue.articles.publish.total")
        .description("Total number of tasks published into article queue")
        .register(meterRegistry);

    this.takeCounter = Counter.builder("monew.queue.articles.take.total")
        .description("Total number of tasks consumed from article queue")
        .register(meterRegistry);
  }

  @Override
  public void publish(FilteredArticlesTask article) {
    queue.offer(article);
    publishCounter.increment();
  }

  @Override
  public FilteredArticlesTask take() throws InterruptedException {
    FilteredArticlesTask task = queue.take();
    takeCounter.increment();
    return task;
  }

  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }
}
