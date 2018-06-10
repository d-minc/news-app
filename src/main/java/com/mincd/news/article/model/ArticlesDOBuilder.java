package com.mincd.news.article.model;

import java.util.Set;

public final class ArticlesDOBuilder {
    private String country;
    private String category;
    private Set<ArticleDO> articles;

    private ArticlesDOBuilder() {
    }

    public static ArticlesDOBuilder anArticlesDO() {
        return new ArticlesDOBuilder();
    }

    public ArticlesDOBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public ArticlesDOBuilder withCategory(String category) {
        this.category = category;
        return this;
    }

    public ArticlesDOBuilder withArticles(Set<ArticleDO> articles) {
        this.articles = articles;
        return this;
    }

    public ArticlesDO build() {
        ArticlesDO articlesDO = new ArticlesDO();
        articlesDO.setCountry(country);
        articlesDO.setCategory(category);
        articlesDO.setArticles(articles);
        return articlesDO;
    }
}
