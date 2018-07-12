package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface ArticleService {
    Article getArticleById(int articleId);
    int plusArticleClickNumber(int articleId);
    List<Article> getTopNArticleIdByDay(String sDate,String eDate,int topNum);
    List<Article> getArticleByDay(String sDate,String eDate);
    List<Article> getTopNArticleIdByTypeName(String typeName,int topNum);
    List<Article> getTopNArticleIdByTypeId(int typeId,int topNum);
    List<Article> getHistoryRecordByUserId(int userId);
    List<Article> getCollectionByUserId(int userId);
}
