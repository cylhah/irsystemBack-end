package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    public void queryTopNArticleIdByTypeId(){
        List<Integer> integerList = articleDao.queryTopNArticleIdByTypeName("java",10);
        List<Integer> integerList2 = articleDao.queryTopNArticleIdByTypeName("java",1);
        System.out.println(integerList.toString());
        System.out.println(integerList2.toString());
    }

    @Test
    public void plusArticleClickNumber(){
        System.out.println(articleDao.plusArticleClickNumber(1));
    }

    @Test
    public void queryHistoryRecordByUserId() {
        List<Article> test = articleDao.queryHistoryRecordByUserId(1);
        System.out.println(test.toString());
    }

    @Test
    public void queryCollectionByUserId() {
        List<Article> test = articleDao.queryCollectionByUserId(1);
        System.out.println(test.toString());
    }
}