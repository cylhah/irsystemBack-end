package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface ArticleService {
    Article getArticleById(int articleId);
    int plusArticleClickNumber(int articleId);
    List<Article> getTopNArticleIdByTypeName(String typeName,int topNum);
    List<Article> getHistoryRecordByUserId(int userId);
    List<Article> getCollectionByUserId(int userId);
}
