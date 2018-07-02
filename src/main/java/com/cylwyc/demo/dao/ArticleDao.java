package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface ArticleDao {
    Article queryArticleById(int articleId);
    Article queryHottestArticleByTypeId(int typeId);
    //获得文章同时获取与用户的关系（是否收藏、点赞等）
    Article queryArticleByIdAndUserId(int articleId,int userId);
    //通过用户Id查找推荐列表
    List<Article> queryRecListByUserId(int userId);

    List<Article> queryHistoryRecordByUserId(int userId);
    List<Article> queryCollectionByUserId(int userId);
}
