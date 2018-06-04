package com.mincd.news.exchange.service;

import com.mincd.news.article.model.ArticleDO;
import com.mincd.news.article.model.CategoryDO;
import com.mincd.news.article.model.CountryDO;
import com.mincd.news.exchange.model.NewsArticlesDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
     * Get the articles from external api
     *
     * @param lang
     * @param category
     * @return
     */
    public ArticleDO readArticles(String lang, String category) {
        //TODO: dominc, refactor
        NewsArticlesDO result;
        result = getExternalArticles(lang, category);
        //TODO: return proper object
        return new ArticleDO();
    }

    /**
     * External Api rest call
     *
     * @param lang
     * @param lang
     * @param category @return
     * @throws RestClientException
     */
    private NewsArticlesDO getExternalArticles(String lang, String category) {
        //TODO: map lang to country
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(NEWS_API_URI)
                .queryParam("country", lang)
                .queryParam("category", category)
                .queryParam("apiKey", API_KEY);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(
                Charset.forName(StandardCharsets.UTF_8.name())));
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        NewsArticlesDO result = null;
        try {
            //TODO: dominc, correct the technicals
//            ResponseEntity<NewsArticlesDO> response = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, entity, NewsArticlesDO.class);
            ResponseEntity<String> response = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, entity, String.class);
//            result = response.getBody();
            result = new NewsArticlesDO();
        } catch (RestClientException e) {
            //TODO: dominc, throw e?
            logger.warn(e.getMessage());
        }
        return result;
    }

}
