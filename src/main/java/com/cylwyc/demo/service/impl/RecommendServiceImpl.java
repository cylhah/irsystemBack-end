package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.HistoryRecordDao;
import com.cylwyc.demo.dao.UserAndTypeDao;
import com.cylwyc.demo.dao.UserGroupDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.domain.UserGroup;
import com.cylwyc.demo.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecommendServiceImpl implements RecommendService {

    @Autowired
    private UserAndTypeDao userAndTypeDao;

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private UserGroupDao userGroupDao;

    @Autowired
    private HistoryRecordDao historyRecordDao;

    @Override
    public List<Article> recommendArticle(int userId) {
        List<Type> types = userAndTypeDao.queryTypeByUserId(userId);
        List<Integer> articleIds = new ArrayList<>();
        int i;
        for (i=0;i<types.size();i++) {
            List<Integer> articleIdByTypeId = articleDao.queryTopNArticleIdByTypeId(types.get(i).getTypeId(), 2);
            if (articleIdByTypeId!=null){
                articleIds.addAll(articleIdByTypeId);
            }
        }
        List<UserGroup> userGroups = userGroupDao.queryUserGroup(userId);
        for (i=0;i<userGroups.size();i++){
            List<Integer> articleIdByGroup = historyRecordDao.queryLatestHistoryRecordDouble(userId);
            if (articleIdByGroup!=null){
                articleIds.addAll(articleIdByGroup);
            }
        }
        List<Article> articles = new ArrayList<>();
        for (i=0;i<articleIds.size();i++){
            Article article = articleDao.queryArticleById(articleIds.get(i));
            if (article!=null){
                articles.add(article);
            }
        }
        return articles;
    }
}
