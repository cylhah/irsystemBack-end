package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void queryArticleById() {
        Article test = articleDao.queryArticleById(1);
        System.out.println(test.toString());
    }

    @Test
    public void queryHottestArticleByTypeId() {
        Article test = articleDao.queryHottestArticleByTypeId(2);
        System.out.println(test.toString());
    }

    @Test
    public void queryArticleByIdAndUserId() {
        Article test = articleDao.queryArticleByIdAndUserId(1,1);
        System.out.println(test.toString());
    }

    @Test
    public void queryHistoryRecordByUserId() {
    }

    @Test
    public void queryCollectionByUserId() {
    }
}