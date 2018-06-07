package com.mincd.news.article.model;

import java.util.Set;

/**
 * Domain model used for storing articles
 */
public class ArticlesDO {

    private String country;
    private String category;
    private Set<ArticleDO> articles;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<ArticleDO> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleDO> articles) {
        this.articles = articles;
    }

}
