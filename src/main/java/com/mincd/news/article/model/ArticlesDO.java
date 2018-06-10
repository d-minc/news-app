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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticlesDO that = (ArticlesDO) o;

        if (!country.equals(that.country)) return false;
        if (!category.equals(that.category)) return false;
        return articles != null ? articles.equals(that.articles) : that.articles == null;
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + (articles != null ? articles.hashCode() : 0);
        return result;
    }
}
