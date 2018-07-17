package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleGroupDao {
    List<Integer> getSimilarArticleId(@Param("articleId1") int articleId1);
}
