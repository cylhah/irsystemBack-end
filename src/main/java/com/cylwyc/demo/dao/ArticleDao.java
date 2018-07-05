package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    Article queryArticleById(@Param("articleId") int articleId);
    Article queryHottestArticleByTypeId(@Param("typeId") int typeId);

    List<Article> queryHistoryRecordByUserId(@Param("userId") int userId);
    List<Article> queryCollectionByUserId(@Param("userId") int userId);
}
