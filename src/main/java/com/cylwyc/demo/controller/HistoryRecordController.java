package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Result;
import com.cylwyc.demo.service.ArticleService;
import com.cylwyc.demo.service.HistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historyRecord")
public class HistoryRecordController {

    @Autowired
    private HistoryRecordService historyRecordService;

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/{userId}")
    public List<Article> getHistoryRecordByUserId(@PathVariable("userId") int userId){
        return articleService.getHistoryRecordByUserId(userId);
    }

    @PostMapping(value = "/{userId}/{articleId}")
    public int addHistoryRecord(@PathVariable("userId") int userId,
                                   @PathVariable("articleId") int articleId){
        return historyRecordService.insertHistoryRecord(userId, articleId);
    }

    @DeleteMapping(value = "/{userId}/{articleId}")
    public int deleteHistoryRecord(@PathVariable("userId") int userId,
                                   @PathVariable("articleId") int articleId){
        return historyRecordService.deleteHistoryRecord(userId,articleId);
    }

    @DeleteMapping(value = "/{userId}")
    public int deleteAllHistoryRecordByUserId(@PathVariable("userId") int userId){
        return historyRecordService.deleteAllHistoryRecordByUserId(userId);
    }
}
