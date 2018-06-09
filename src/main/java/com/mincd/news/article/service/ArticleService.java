package com.mincd.news.article.service;

import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.article.utils.ArticleConverter;
import com.mincd.news.external.service.ExternalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private static final int WORKING_DAYS_PER_MONTH = 22;

    @Autowired
    private ArticleConverter articleConverter;

    @Autowired
    private ExternalNewsService externalNewsService;

    public ArticlesDO getArticles(String lang, String category) {
        return articleConverter.convertExternalArticle(externalNewsService.getExternalArticles(lang, category), lang, category);

    }

}