package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface ArticleService {
    Article getArticleById(int articleId);
    List<Article> getHistoryRecordByUserId(int userId);
    List<Article> getCollectionByUserId(int userId);
}
