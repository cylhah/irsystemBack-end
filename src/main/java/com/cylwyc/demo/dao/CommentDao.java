package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Comment;

import java.util.List;

public interface CommentDao {
    Comment queryCommentById(int commentId);
    List<Comment> queryCommentByArticleId(int articleId);
    List<Comment> queryCommentByUserId(int userId);
    int insertComment(Comment comment);
}
