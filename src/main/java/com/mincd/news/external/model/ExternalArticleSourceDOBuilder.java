package com.mincd.news.external.model;

public final class ExternalArticleSourceDOBuilder {
    private String id;
    private String name;

    private ExternalArticleSourceDOBuilder() {
    }

    public static ExternalArticleSourceDOBuilder anExternalArticleSourceDO() {
        return new ExternalArticleSourceDOBuilder();
    }

    public ExternalArticleSourceDOBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public ExternalArticleSourceDOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ExternalArticleSourceDO build() {
        ExternalArticleSourceDO externalArticleSourceDO = new ExternalArticleSourceDO();
        externalArticleSourceDO.setId(id);
        externalArticleSourceDO.setName(name);
        return externalArticleSourceDO;
    }
}
