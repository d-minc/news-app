package com.mincd.news.external.service;

import com.mincd.news.article.model.CategoryDO;
import com.mincd.news.article.model.CountryDO;
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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ExternalNewsService {
    public static final String NEWS_API_URI = "https://newsapi.org/v2/top-headlines";
    public static final String API_KEY = "0583e85390b449f0a8e506415d3e26d9";
    private static final Logger logger = LoggerFactory.getLogger(ExternalNewsService.class);

    //TODO: dominc, add Cache

    public ExternalNewsService() {
    }

    /**
     * Get country codes available in the application
     *
     * @return
     */
    public List<CountryDO> getAvailableCountries() {
        //TODO: dominc, add logic
        return Collections.singletonList(new CountryDO("PL"));
    }

    public List<CategoryDO> getAvailableCategories() {
        //TODO: dominc, add logic
        return Collections.singletonList(new CategoryDO("business"));
    }

    /**
     * External Api rest call
     *
     * @param lang
     * @param lang
     * @param category @return
     * @throws RestClientException
     */
    public ExternalArticlesDO getExternalArticles(String lang, String category) {
        //TODO: map lang to country
        String uri = generateUri(lang, category);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = prepareRequest();
        ExternalArticlesDO result = null;
        try {
            ResponseEntity<ExternalArticlesDO> response = restTemplate.exchange(uri, HttpMethod.GET, request, ExternalArticlesDO.class);
            result = response.getBody();
        } catch (RestClientException e) {
            //TODO: dominc, throw e?
            logger.warn(e.getMessage());
        }
        return result;
    }

    private HttpEntity<String> prepareRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return new HttpEntity<>("parameters", headers);
    }

    private String generateUri(String lang, String category) {
        return UriComponentsBuilder.fromHttpUrl(NEWS_API_URI)
                .queryParam("country", lang)
                .queryParam("category", category)
                .queryParam("apiKey", API_KEY).toUriString();
    }

}
