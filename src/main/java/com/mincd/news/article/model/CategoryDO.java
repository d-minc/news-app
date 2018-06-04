package com.mincd.news.article.model;

/**
 * Representing country codes
 */
public class CategoryDO {
    private String category;

    public CategoryDO() {
    }

    public CategoryDO(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
