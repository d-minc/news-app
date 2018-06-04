package com.mincd.news.article.model;

/**
 * Representing country codes
 */
public class CountryDO {
    private String country;

    public CountryDO() {
    }

    public CountryDO(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
