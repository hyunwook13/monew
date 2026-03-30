package com.team03.monew.articleCollect.service;

import com.team03.monew.interest.domain.Interest;
import com.team03.monew.articleCollect.domain.FetchedArticles;
import com.team03.monew.articleCollect.domain.FilteredArticlesTask;
import com.team03.monew.articleCollect.infrastructure.client.RssClient;
import com.team03.monew.articleCollect.domain.ArticlesFeed;
import com.team03.monew.articleCollect.infrastructure.queue.ArticlesQueue;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticlesCollectService implements CollectService {

  private final RssClient rssClient;
  private final ArticlesQueue articlesQueue;
  private final KeywordFilterService keywordFilterService;
  private final MeterRegistry meterRegistry;

  public void fetchAllArticles() {
    List<ArticlesFeed> feeds = Arrays.stream(ArticlesFeed.values()).toList();

    feeds.forEach(feed -> {
      Timer.Sample sample = Timer.start(meterRegistry);
      feedAttemptCounter(feed).increment();
      boolean success = false;
      try {
        rssClient.fetchAndParse(feed, this::handleOneArticle);
        success = true;
        feedSuccessCounter(feed).increment();
      } catch (Exception e) {
        feedFailureCounter(feed).increment();
        log.error("Failed to fetch feed: {}", feed.getUrl(), e);
      } finally {
        String result = success ? "success" : "failure";
        Timer timer = feedDurationTimer(feed, result);
        sample.stop(timer);
      }
    });
  }

  void handleOneArticle(FetchedArticles article) {
    Set<Interest> matched = keywordFilterService.matchingInterests(article);
    matchedInterestsCounter().increment(matched.size());

    if (!matched.isEmpty()) {
      articlesQueue.publish(new FilteredArticlesTask(article, matched));
      queuedArticlesCounter().increment();
    } else {
      filteredOutArticlesCounter().increment();
    }
  }

  private Counter feedAttemptCounter(ArticlesFeed feed) {
    return meterRegistry.counter("monew.rss.feed.attempt.total", "feed", feed.name());
  }

  private Counter feedSuccessCounter(ArticlesFeed feed) {
    return meterRegistry.counter("monew.rss.feed.success.total", "feed", feed.name());
  }

  private Counter feedFailureCounter(ArticlesFeed feed) {
    return meterRegistry.counter("monew.rss.feed.failure.total", "feed", feed.name());
  }

  private Timer feedDurationTimer(ArticlesFeed feed, String result) {
    return meterRegistry.timer("monew.rss.feed.duration", "feed", feed.name(), "result", result);
  }

  private Counter matchedInterestsCounter() {
    return meterRegistry.counter("monew.rss.article.matched_interests.total");
  }

  private Counter queuedArticlesCounter() {
    return meterRegistry.counter("monew.rss.article.queued.total");
  }

  private Counter filteredOutArticlesCounter() {
    return meterRegistry.counter("monew.rss.article.filtered_out.total");
  }
}
