package com.mincd.news.article.model;

/**
 * Domain model used for storing articles
 */
public class ArticleDO {

    private String country;
    private String category;
    private String author;
    private String title;
    private String description;
    private String date;//TODO: dominc, change to date
    private String sourceName;
    private String articleUrl;
    private String imageUrl;

    public ArticleDO() {
        //default constructor
    }

}
