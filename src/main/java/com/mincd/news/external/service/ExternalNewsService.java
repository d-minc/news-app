package com.mincd.news.external.service;

import com.mincd.news.external.model.ExternalArticlesDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class ExternalNewsService {
    private static final String NEWS_API_URI = "https://newsapi.org/v2/top-headlines";
    private static final String NEWS_API_KEY = "0583e85390b449f0a8e506415d3e26d9";
    private static final Logger logger = LoggerFactory.getLogger(ExternalNewsService.class);
    private static final String HTTP_HEADER_X_NO_CACHE = "X-No-Cache";
    private static final String HTTP_HEADER_X_NO_CACHE_TRUE_VALUE = "true";

    /**
     * External Api rest call
     *
     * @param lang Language code for a country
     * @param category Article category available in newsapi eg. "business"
     * @return External articles
     */
    public ExternalArticlesDO getExternalArticles(String lang, String category) {
        String uri = generateUri(lang, category);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = prepareRequest();
        ExternalArticlesDO result;
        try {
            ResponseEntity<ExternalArticlesDO> response = restTemplate.exchange(uri, HttpMethod.GET, request, ExternalArticlesDO.class);
            result = response.getBody();
        } catch (RestClientException exception) {
            logger.warn(exception.getMessage());
            throw exception;
        }
        return result;
    }

    /**
     * Prepare the headers und turns off Newsapi caching.
     * Without the "X-No-Cache" header, the Newsapi tries to cache the request, but it causes an error on api side.
     * Newsapi caching needs to be switched off because, there is caching in the application
     *
     * @return Http headers
     * @see com.mincd.news.configuration.CacheConfig
     */
    private HttpEntity<String> prepareRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add(HTTP_HEADER_X_NO_CACHE, HTTP_HEADER_X_NO_CACHE_TRUE_VALUE);
        return new HttpEntity<>("parameters", headers);
    }

    private String generateUri(String lang, String category) {
        return UriComponentsBuilder.fromHttpUrl(NEWS_API_URI)
                .queryParam("country", lang)
                .queryParam("category", category)
                .queryParam("apiKey", NEWS_API_KEY).toUriString();
    }

}
