package com.mincd.news.article.service;

import com.mincd.news.article.model.ArticleDO;
import com.mincd.news.exchange.service.ExternalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private static final int WORKING_DAYS_PER_MONTH = 22;

    @Autowired
    private ExternalNewsService externalNewsService;

    public ArticleDO getArticles(String lang, String category) {
        return externalNewsService.readArticles(lang, category);
    }

}
