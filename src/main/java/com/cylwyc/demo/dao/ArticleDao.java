package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    Article queryArticleById(@Param("articleId") int articleId);
    List<Integer> queryTopNArticleIdByTypeName(@Param("typeName") String typeName,@Param("topNum") int topNum);
    List<Article> queryHistoryRecordByUserId(@Param("userId") int userId);
    List<Article> queryCollectionByUserId(@Param("userId") int userId);
}
