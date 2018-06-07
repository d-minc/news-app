package com.mincd.news.external.model;

import java.util.List;

/**
 * Model for external api articles
 */
public class ExternalArticlesDO {

    private String status;
    private int totalResults;
    private List<ExternalArticleDO> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<ExternalArticleDO> getArticles() {
        return articles;
    }

    public void setArticles(List<ExternalArticleDO> articles) {
        this.articles = articles;
    }
}
