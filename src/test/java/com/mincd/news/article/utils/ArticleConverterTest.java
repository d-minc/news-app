package com.mincd.news.article.utils;

import com.mincd.news.article.model.ArticleDO;
import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.external.model.ExternalArticleDOBuilder;
import com.mincd.news.external.model.ExternalArticleSourceDOBuilder;
import com.mincd.news.external.model.ExternalArticlesDO;
import com.mincd.news.external.model.ExternalArticlesDOBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ArticleConverterTest {

    private static final String AUTHOR = "John Doe";
    private static final String DESCRIPTION = "How to do";
    private static final String PUBLISHED_AT = "01-01-1990 10:20:00";
    private static final String PUBLISHED_AT_DATE_ONLY = "1990-01-01";
    private static final String SOURCE_NAME = "News portal";
    private static final String TITLE = "My art";
    private static final String URL = "some.url/art";
    private static final String URL_TO_IMAGE = "some.url/image.png";

    @InjectMocks
    private ArticleConverter articleConverter;

    @Test
    public void convertExternalArticle() throws Exception {
        //given
        String language = "pl";
        String category = "business";
        ExternalArticlesDO sampleExternalArticles = sampleExternalArticles();

        //when

        ArticlesDO result = articleConverter.convertExternalArticle(sampleExternalArticles, language, category);

        //then
        assertThat(result.getArticles().isEmpty(), is(false));
        assertThat(result.getCategory(), is(equalTo(category)));
        assertThat(result.getCountry(), is(equalTo(language)));

        for (ArticleDO articleDO : result.getArticles()) {
            assertThat(articleDO.getArticleUrl(), is(equalTo(URL)));
            assertThat(articleDO.getAuthor(), is(equalTo(AUTHOR)));
            assertThat(articleDO.getDate(), is(equalTo(PUBLISHED_AT_DATE_ONLY)));
            assertThat(articleDO.getDescription(), is(equalTo(DESCRIPTION)));
            assertThat(articleDO.getImageUrl(), is(equalTo(URL_TO_IMAGE)));
            assertThat(articleDO.getSourceName(), is(equalTo(SOURCE_NAME)));
            assertThat(articleDO.getTitle(), is(equalTo(TITLE)));
        }


    }

    private ExternalArticlesDO sampleExternalArticles() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Date publishedAt = null;
        try {
            publishedAt = simpleDateFormat.parse(PUBLISHED_AT);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ExternalArticlesDOBuilder.anExternalArticlesDO().withArticles(
                Collections.singletonList(ExternalArticleDOBuilder.anExternalArticleDO()
                        .withAuthor(AUTHOR)
                        .withDescription(DESCRIPTION)
                        .withPublishedAt(publishedAt)
                        .withSource(
                                ExternalArticleSourceDOBuilder.anExternalArticleSourceDO().withName(SOURCE_NAME).build())
                        .withTitle(TITLE)
                        .withUrl(URL)
                        .withUrlToImage(URL_TO_IMAGE)
                        .build())
        ).build();
    }

}