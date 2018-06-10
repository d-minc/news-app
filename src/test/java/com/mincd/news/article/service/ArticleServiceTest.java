package com.mincd.news.article.service;

import com.mincd.news.article.model.ArticleDOBuilder;
import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.article.model.ArticlesDOBuilder;
import com.mincd.news.article.utils.ArticleConverter;
import com.mincd.news.external.model.ExternalArticleDOBuilder;
import com.mincd.news.external.model.ExternalArticlesDO;
import com.mincd.news.external.model.ExternalArticlesDOBuilder;
import com.mincd.news.external.service.ExternalNewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArticleServiceTest {

    @Mock
    private ExternalNewsService externalNewsService;

    @Mock
    private ArticleConverter articleConverter;

    @InjectMocks
    private ArticleService articleService;

    @Test
    public void getArticles() {
        //given
        String language = "pl";
        String category = "business";

        //when
        when(externalNewsService.getExternalArticles(language, category)).thenReturn(mockExternalArticles());
        when(articleConverter.convertExternalArticle(any(), any(), any())).thenReturn(mockConvertedArticles(language, category));

        ArticlesDO result = articleService.getArticles(language, category);

        //then
        assertThat(result.getArticles().isEmpty(), is(false));
        assertThat(result.getCategory(), is(equalTo(category)));
        assertThat(result.getCountry(), is(equalTo(language)));
    }

    private ArticlesDO mockConvertedArticles(String language, String category) {
        return ArticlesDOBuilder.anArticlesDO().withArticles(
                Collections.singleton(ArticleDOBuilder.anArticleDO().build()))
                .withCountry(language).withCategory(category).build();
    }

    private ExternalArticlesDO mockExternalArticles() {
        return ExternalArticlesDOBuilder.anExternalArticlesDO().withArticles(
                Collections.singletonList(ExternalArticleDOBuilder.anExternalArticleDO().build())
        ).build();
    }

}