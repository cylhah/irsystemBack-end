package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/{articleId}")
    public Article getArticleById(@PathVariable("articleId") int articleId){
        return articleService.getArticleById(articleId);
    }

    @GetMapping(value = "/typeName/{typeName}/topNum/{topNum}")
    public List<Article> getTopNArticleIdByTypeName(@PathVariable("typeName") String typeName,
                                                    @PathVariable("topNum") int topNum){
        return articleService.getTopNArticleIdByTypeName(typeName,topNum);
    }
}
