package com.mincd.news.article.utils;

import com.mincd.news.article.model.ArticleDO;
import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.external.model.ExternalArticleDO;
import com.mincd.news.external.model.ExternalArticlesDO;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

@Service
public class ArticleConverter {

    //TODO: dominc, remove this converter and use http://mapstruct.org/ plugin

    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

    public ArticlesDO convertExternalArticle(final ExternalArticlesDO externalArticleDO, String lang, String category) {
        ArticlesDO articlesDO = new ArticlesDO();
        articlesDO.setCountry(lang);
        articlesDO.setCategory(category);
        if (externalArticleDO.getArticles() != null && !externalArticleDO.getArticles().isEmpty()) {
            articlesDO.setArticles(externalArticleDO.getArticles().stream()
                    .map(this::createArticleDO)
                    .collect(Collectors.toSet()));
        }
        return articlesDO;
    }

    private ArticleDO createArticleDO(ExternalArticleDO externalArticleDO) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);
        ArticleDO articleDO = new ArticleDO();
        articleDO.setArticleUrl(externalArticleDO.getUrl());
        articleDO.setAuthor(externalArticleDO.getAuthor());
        articleDO.setDate(dateFormat.format(externalArticleDO.getPublishedAt()));
        articleDO.setDescription(externalArticleDO.getDescription());
        articleDO.setImageUrl(externalArticleDO.getUrlToImage());
        articleDO.setSourceName(externalArticleDO.getSource().getName());
        articleDO.setTitle(externalArticleDO.getTitle());
        return articleDO;
    }
}
