package com.mincd.news.article.controller;

import com.mincd.news.article.model.ArticlesDO;
import com.mincd.news.article.service.ArticleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller used for salary calculations
 */
@Controller
@Api(value = "articles", description = "Allows the reading of news articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/news/{lang}/{category}", method = RequestMethod.GET)
    @ResponseBody
    ArticlesDO calculateIncome(@PathVariable("lang") String lang, @PathVariable("category") String category) {
        return articleService.getArticles(lang, category);
    }

}
