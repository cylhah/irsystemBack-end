package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.SimilarArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/similar")
public class SimilarArticleController {

    @Autowired
    private SimilarArticleService similarArticleService;

    @PostMapping(value = "/recommend")
    public List<Article> getSimilarArticle(@RequestParam("articleId") int articleId){
        List<Article> articles = similarArticleService.getSimilarArticle(articleId);
        return articles;
    }
}
