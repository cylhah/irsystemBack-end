package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.CollectionDao;
import com.cylwyc.demo.dao.UpAndDownDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private UpAndDownDao upAndDownDao;

    @Autowired
    private CollectionDao collectionDao;

    @Override
    public Article getArticleById(int articleId) {
        return articleDao.queryArticleById(articleId);
    }

    @Override
    public List<Article> getHistoryRecordByUserId(int userId) {
        List<Article> articleList = articleDao.queryHistoryRecordByUserId(userId);
        for (int i = 0;i <articleList.size();i++){
            Article article = articleList.get(i);
            int articleId = article.getArticleId();
            int upOrDown = upAndDownDao.queryUpAndDown(article.getArticleId(),userId);
            articleList.get(i).setUpOrDown(upOrDown);
            if (collectionDao.queryCollection(articleId,userId)==1){
                articleList.get(i).setCollectTime(collectionDao.queryCollectionTime(articleId,userId));
            }
        }
        return articleList;
    }

    @Override
    public List<Article> getCollectionByUserId(int userId) {
        List<Article> articleList = articleDao.queryCollectionByUserId(userId);
        for (int i=0;i<articleList.size();i++){

        }
        return null;
    }
}
