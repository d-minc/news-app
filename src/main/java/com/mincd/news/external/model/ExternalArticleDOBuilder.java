package com.mincd.news.external.model;

import java.util.Date;

public final class ExternalArticleDOBuilder {
    private ExternalArticleSourceDO source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Date publishedAt;

    private ExternalArticleDOBuilder() {
    }

    public static ExternalArticleDOBuilder anExternalArticleDO() {
        return new ExternalArticleDOBuilder();
    }

    public ExternalArticleDOBuilder withSource(ExternalArticleSourceDO source) {
        this.source = source;
        return this;
    }

    public ExternalArticleDOBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public ExternalArticleDOBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ExternalArticleDOBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ExternalArticleDOBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public ExternalArticleDOBuilder withUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
        return this;
    }

    public ExternalArticleDOBuilder withPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public ExternalArticleDO build() {
        ExternalArticleDO externalArticleDO = new ExternalArticleDO();
        externalArticleDO.setSource(source);
        externalArticleDO.setAuthor(author);
        externalArticleDO.setTitle(title);
        externalArticleDO.setDescription(description);
        externalArticleDO.setUrl(url);
        externalArticleDO.setUrlToImage(urlToImage);
        externalArticleDO.setPublishedAt(publishedAt);
        return externalArticleDO;
    }
}
