package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/recommend")
public class RecommendController {

    @Autowired
    private RecommendService recommendService;

    @PostMapping(value = "/complex")
    public List<Article> complexRecommend(@RequestParam("userId") int userId){
        List<Article> articles = recommendService.recommendArticle(userId);
        return articles;
    }
}
