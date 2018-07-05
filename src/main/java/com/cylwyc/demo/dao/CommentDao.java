package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    Comment queryCommentById(@Param("commentId") int commentId);
    List<Comment> queryCommentByArticleId(@Param("articleId") int articleId);
    List<Comment> queryCommentByUserId(@Param("userId") int userId);
    int insertComment(Comment comment);
}
