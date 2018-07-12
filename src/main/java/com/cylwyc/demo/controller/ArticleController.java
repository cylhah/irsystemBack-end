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

    @PostMapping(value = "/date/top")
    public List<Article> getTopNArticleIdByDay(@RequestParam("sDate") String sDate,
                                               @RequestParam("eDate") String eDate,
                                               @RequestParam("topNum") int topNum){
        return articleService.getTopNArticleIdByDay(sDate, eDate, topNum);
    }

    @PostMapping(value = "/date")
    public List<Article> getArticleByDay(@RequestParam("sDate") String sDate,
                                         @RequestParam("eDate") String eDate){
        return articleService.getArticleByDay(sDate, eDate);
    }

    @GetMapping(value = "typeId/{typeId}/topNum/{topNum}")
    public List<Article> getTopNArticleIdByTypeId(@PathVariable("typeId") int typeId,
                                                  @PathVariable("topNum") int topNum){
        return articleService.getTopNArticleIdByTypeId(typeId,topNum);
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
