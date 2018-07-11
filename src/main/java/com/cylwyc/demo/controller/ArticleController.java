package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/{articleId}/clickNumber")
    public int plusArticleClickNumber(@PathVariable("articleId") int articleId){
        return articleService.plusArticleClickNumber(articleId);
    }
}
