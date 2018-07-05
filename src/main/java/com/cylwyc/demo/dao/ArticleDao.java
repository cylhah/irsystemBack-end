package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    Article queryArticleById(@Param("articleId") int articleId);
    Article queryHottestArticleByTypeId(int typeId);
    //获得文章同时获取与用户的关系（是否收藏、点赞等）
    Article queryArticleByIdAndUserId(@Param("articleId") int articleId,@Param("userId") int userId);
    //通过用户Id查找推荐列表
    List<Article> queryRecListByUserId(@Param("userId") int userId);

    List<Article> queryHistoryRecordByUserId(@Param("userId") int userId);
    List<Article> queryCollectionByUserId(@Param("userId") int userId);
}
