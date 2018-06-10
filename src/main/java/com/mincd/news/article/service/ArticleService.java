package com.mincd.news.article.service;

import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.article.utils.ArticleConverter;
import com.mincd.news.configuration.CacheConfig;
import com.mincd.news.external.service.ExternalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private ArticleConverter articleConverter;

    @Autowired
    private ExternalNewsService externalNewsService;

    /**
     * Read the articles from cache or direct from External Newsapi when not cached
     *
     * @param lang     Language of the articles
     * @param category Category for finding the articles
     * @return Articles
     */
    @Cacheable(value = "articles", cacheManager = CacheConfig.TIMEOUT_CACHE_MANAGER)
    public ArticlesDO getArticles(String lang, String category) {
        return articleConverter.convertExternalArticle(externalNewsService.getExternalArticles(lang, category), lang, category);

    }

}
