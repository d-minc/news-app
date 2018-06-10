package com.mincd.news.external.model;

import java.util.List;

public final class ExternalArticlesDOBuilder {
    private String status;
    private int totalResults;
    private List<ExternalArticleDO> articles;

    private ExternalArticlesDOBuilder() {
    }

    public static ExternalArticlesDOBuilder anExternalArticlesDO() {
        return new ExternalArticlesDOBuilder();
    }

    public ExternalArticlesDOBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public ExternalArticlesDOBuilder withTotalResults(int totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    public ExternalArticlesDOBuilder withArticles(List<ExternalArticleDO> articles) {
        this.articles = articles;
        return this;
    }

    public ExternalArticlesDO build() {
        ExternalArticlesDO externalArticlesDO = new ExternalArticlesDO();
        externalArticlesDO.setStatus(status);
        externalArticlesDO.setTotalResults(totalResults);
        externalArticlesDO.setArticles(articles);
        return externalArticlesDO;
    }
}
