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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalArticlesDO that = (ExternalArticlesDO) o;

        if (totalResults != that.totalResults) return false;
        if (!status.equals(that.status)) return false;
        return articles != null ? articles.equals(that.articles) : that.articles == null;
    }

    @Override
    public int hashCode() {
        int result = status.hashCode();
        result = 31 * result + totalResults;
        result = 31 * result + (articles != null ? articles.hashCode() : 0);
        return result;
    }
}
