package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface SimilarArticleService {

    /**
     * 推荐相似文章
     * @param articleId 本文章
     * @return
     */
    List<Article> getSimilarArticle(int articleId);
}
