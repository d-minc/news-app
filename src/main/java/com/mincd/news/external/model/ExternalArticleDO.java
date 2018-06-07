package com.mincd.news.external.model;

import java.util.Date;

/**
 * Sub-element of JSON ExternalArticlesDO
 */
public class ExternalArticleDO {

    private ExternalArticleSourceDO source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Date publishedAt;//TODO: dominc, change to Date eg. "2018-06-03T08:01:48Z"

    public ExternalArticleSourceDO getSource() {
        return source;
    }

    public void setSource(ExternalArticleSourceDO source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

}
