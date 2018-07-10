package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.ArticleService;
import com.cylwyc.demo.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/userId/{userId}")
    public List<Article> getCollectionByUserId(@PathVariable("userId") int userId){
        return articleService.getCollectionByUserId(userId);
    }

    @GetMapping(value = "/userId/{userId}/articleId/{articleId}")
    public int getCollection(@PathVariable("userId") int userId,
                             @PathVariable("articleId") int articleId){
        return collectionService.getCollection(userId, articleId);
    }

    @PostMapping(value = "/userId/{userId}/articleId/{articleId}")
    public int insertCollection(@PathVariable("userId") int userId,
                                @PathVariable("articleId") int articleId){
        return collectionService.insertCollection(userId, articleId);
    }

    @DeleteMapping(value = "/userId/{userId}/articleId/{articleId}")
    public int deleteCollection(@PathVariable("userId") int userId,
                                @PathVariable("articleId") int articleId){
        return collectionService.deleteCollection(userId, articleId);
    }
}
