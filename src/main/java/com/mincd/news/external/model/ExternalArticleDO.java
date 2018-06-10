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
    private Date publishedAt;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalArticleDO that = (ExternalArticleDO) o;

        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (!title.equals(that.title)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!url.equals(that.url)) return false;
        if (urlToImage != null ? !urlToImage.equals(that.urlToImage) : that.urlToImage != null) return false;
        return publishedAt.equals(that.publishedAt);
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + title.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + url.hashCode();
        result = 31 * result + (urlToImage != null ? urlToImage.hashCode() : 0);
        result = 31 * result + publishedAt.hashCode();
        return result;
    }
}
