package com.mincd.news.article.model;

public class ArticleDO {
    private String author;

    private String title;
    private String description;
    private String date;
    private String sourceName;
    private String articleUrl;
    private String imageUrl;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleDO articleDO = (ArticleDO) o;

        if (author != null ? !author.equals(articleDO.author) : articleDO.author != null) return false;
        if (!title.equals(articleDO.title)) return false;
        if (description != null ? !description.equals(articleDO.description) : articleDO.description != null)
            return false;
        if (!date.equals(articleDO.date)) return false;
        if (sourceName != null ? !sourceName.equals(articleDO.sourceName) : articleDO.sourceName != null) return false;
        if (!articleUrl.equals(articleDO.articleUrl)) return false;
        return imageUrl != null ? imageUrl.equals(articleDO.imageUrl) : articleDO.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + title.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + date.hashCode();
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        result = 31 * result + articleUrl.hashCode();
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}
