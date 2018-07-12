package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.CollectionDao;
import com.cylwyc.demo.dao.UpAndDownDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public int plusArticleClickNumber(int articleId) {
        return articleDao.plusArticleClickNumber(articleId);
    }

    @Override
    public List<Article> getTopNArticleIdByDay(String sDate, String eDate, int topNum) {
        List<Integer> articleIdList = articleDao.queryTopNArticleIdByDay(sDate, eDate, topNum);
        List<Article> articleList = new ArrayList<>();
        for (int i=0;i<articleIdList.size();i++){
            int articleId = articleIdList.get(i);
            articleList.add(articleDao.queryArticleById(articleId));
        }
        return articleList;
    }

    @Override
    public List<Article> getArticleByDay(String sDate, String eDate) {
        return articleDao.queryArticleByDay(sDate, eDate);
    }

    @Override
    public List<Article> getTopNArticleIdByTypeName(String typeName, int topNum) {
        List<Integer> articleIdList = articleDao.queryTopNArticleIdByTypeName(typeName,topNum);
        List<Article> articleList = new ArrayList<>();
        for (int i=0;i<articleIdList.size();i++){
            int articleId = articleIdList.get(i);
            articleList.add(articleDao.queryArticleById(articleId));
        }
        return articleList;
    }

    @Override
    public List<Article> getTopNArticleIdByTypeId(int typeId, int topNum) {
        List<Integer> articleIdList = articleDao.queryTopNArticleIdByTypeId(typeId,topNum);
        List<Article> articleList = new ArrayList<>();
        for (int i=0;i<articleIdList.size();i++){
            int articleId = articleIdList.get(i);
            articleList.add(articleDao.queryArticleById(articleId));
        }
        return articleList;
    }

    @Override
    public List<Article> getHistoryRecordByUserId(int userId) {
        List<Article> articleList = articleDao.queryHistoryRecordByUserId(userId);
        for (int i = 0;i <articleList.size();i++){
            Article article = articleList.get(i);
            int articleId = article.getArticleId();
            int upOrDown = upAndDownDao.queryUpAndDown(articleId,userId);
            articleList.get(i).setUpOrDown(upOrDown);
            articleList.get(i).setCollectTime(collectionDao.queryCollectionTime(articleId,userId));
        }
        return articleList;
    }

    @Override
    public List<Article> getCollectionByUserId(int userId) {
        List<Article> articleList = articleDao.queryCollectionByUserId(userId);
        for (int i=0;i<articleList.size();i++){
            int articleId = articleList.get(i).getArticleId();
            int upOrDown = upAndDownDao.queryUpAndDown(articleId,userId);
            articleList.get(i).setUpOrDown(upOrDown);
        }
        return articleList;
    }
}
