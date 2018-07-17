package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.ArticleGroupDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.SimilarArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimilarArticleServiceImpl implements SimilarArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private ArticleGroupDao articleGroupDao;

    @Override
    public List<Article> getSimilarArticle(int articleId) {
        List<Integer> integers = articleGroupDao.getSimilarArticleId(articleId);
        List<Article> articles = new ArrayList<>();
        int i ;
        for (i=0;i<integers.size();i++){
            Article article = articleDao.queryArticleById(integers.get(i));
            if (article!=null){
                articles.add(article);
            }
        }
        return articles;
    }
}
