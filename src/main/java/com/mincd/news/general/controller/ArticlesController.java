package com.mincd.news.general.controller;

import com.mincd.news.article.model.CategoryDO;
import com.mincd.news.article.model.CountryDO;
import com.mincd.news.external.service.ExternalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * General resource used by the whole app
 */
@Controller
public class ArticlesController {
    @Autowired
    ExternalNewsService externalNewsService;

    /**
     * Get the countries available for reading news
     *
     * @return
     */
    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public List<CountryDO> getAvailableCountries() {
        return externalNewsService.getAvailableCountries();
    }

    /**
     * Get the categories available for reading news
     *
     * @return
     */
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<CategoryDO> getAvailableCategories() {
        return externalNewsService.getAvailableCategories();
    }

}
