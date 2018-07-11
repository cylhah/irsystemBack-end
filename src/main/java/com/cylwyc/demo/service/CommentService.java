package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Comment;

import java.util.List;

public interface CommentService {

    /**
     * 用户点击文章时第一次加载的10条最热评论
     * @param articleId 文章id
     * @param page 评论页码
     * @return
     */
    List<Comment> getCommentByAticleId(int articleId, int page);

    /**
     * 用户评论文章-type标识为0
     * @param comment 评论对象(userId,commentId,commentText)
     * @return 检测插入结果是否正确，1为插入成功，0失败(影响的row数)
     */

    int commentArticle(Comment comment);

    /**
     * 回复文章评论-type标识为1
     * @param comment 评论对象(userId,commentId,targetCommentId,replyCommentId,commentText)
     * @return 检测插入结果是否正确，1为插入成功，0失败
     */

    int replyArticleComment(Comment comment);

    /**
     * 回复评论的评论-type标识为2
     * @param comment 评论对象(userId,commentId,targetCommentId,replyCommentId,commentText)
     * @return 检测插入结果是否正确，1为插入成功，0失败
     */
    int replyCommentComment(Comment comment);

    /**
     * 获取子评论-子评论标识为1或2
     * @param commentId 父评论的id
     * @return 返回自评论的列表
     */
    List<Comment> getCommentChild(int commentId, int page);


}
