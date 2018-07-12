package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    Article queryArticleById(@Param("articleId") int articleId);
    int plusArticleClickNumber(@Param("articleId") int articleId);

    /**
     * 日期格式YYYY-MM-DD
     * @param sDate
     * @param eDate
     * @param topNum
     * @return
     */
    List<Integer> queryTopNArticleIdByDay(@Param("sDate") String sDate,@Param("eDate") String eDate,@Param("topNum") int topNum);

    /**
     * 查找某一段时间的所有文章
     * @param sDate
     * @param eDate
     * @return
     */
    List<Article> queryArticleByDay(@Param("sDate") String sDate,@Param("eDate") String eDate);
    List<Integer> queryTopNArticleIdByTypeName(@Param("typeName") String typeName,@Param("topNum") int topNum);
    List<Integer> queryTopNArticleIdByTypeId(@Param("typeId") int typeId,@Param("topNum") int topNum);
    List<Article> queryHistoryRecordByUserId(@Param("userId") int userId);
    List<Article> queryCollectionByUserId(@Param("userId") int userId);
}
