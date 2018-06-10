package com.mincd.news.article.model;

public final class ArticleDOBuilder {
    private String author;
    private String title;
    private String description;
    private String date;
    private String sourceName;
    private String articleUrl;
    private String imageUrl;

    private ArticleDOBuilder() {
    }

    public static ArticleDOBuilder anArticleDO() {
        return new ArticleDOBuilder();
    }

    public ArticleDOBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public ArticleDOBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ArticleDOBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ArticleDOBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public ArticleDOBuilder withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    public ArticleDOBuilder withArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
        return this;
    }

    public ArticleDOBuilder withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public ArticleDO build() {
        ArticleDO articleDO = new ArticleDO();
        articleDO.setAuthor(author);
        articleDO.setTitle(title);
        articleDO.setDescription(description);
        articleDO.setDate(date);
        articleDO.setSourceName(sourceName);
        articleDO.setArticleUrl(articleUrl);
        articleDO.setImageUrl(imageUrl);
        return articleDO;
    }
}
