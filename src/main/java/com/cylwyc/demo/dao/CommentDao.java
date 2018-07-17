package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    List<Comment> queryCommentChildById(@Param("commentId") int commentId,@Param("page") int page);
    List<Comment> queryCommentByArticleId(@Param("articleId") int articleId,@Param("page") int page);
    List<Comment> queryCommentByUserId(@Param("userId") int userId,@Param("page") int page);
    List<Comment> queryUserCommentToArticle(@Param("userId") int userId);
    int insertComment(Comment comment);
    List<Comment> queryCommentReplyById(@Param("commentId") int commentId,@Param("page") int page);
    List<Comment> queryCommentImmediateByUserId(@Param("userId") int userId);
    int updateCommentImmediate(@Param("replyCommentId") int replyCommentId);
}