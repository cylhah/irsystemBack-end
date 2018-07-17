package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface RecommendService {

    /**
     * 用户混合推荐
     * @param userId 用户Id
     * @return
     */
    List<Article> recommendArticle(int userId);
}
