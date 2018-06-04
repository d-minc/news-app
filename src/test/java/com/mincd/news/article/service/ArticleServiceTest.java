package com.mincd.news.article.service;

import com.mincd.news.exchange.service.ExternalNewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArticleServiceTest {

    @Mock
    private ExternalNewsService externalNewsService;

    @InjectMocks
    private ArticleService articleService;

    @Test
    public void getArticles() {
        //given
        //when
        //then
    }

}