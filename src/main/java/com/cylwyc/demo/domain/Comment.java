package com.cylwyc.demo.domain;

import java.util.Date;

public class Comment {

    private Integer commentId;

    private Integer articleId;

    private Integer userId;

    private Integer targetCommentId;

    private Integer replyCommentId;

    private String commentText;

    private Date commentTime;

    private Integer commentUpNumber;

    private Integer commentType;
    //即时回复数
    private Integer immediateNumber;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetCommentId() {
        return targetCommentId;
    }

    public void setTargetCommentId(Integer targetCommentId) {
        this.targetCommentId = targetCommentId;
    }

    public Integer getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Integer replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentUpNumber() {
        return commentUpNumber;
    }

    public void setCommentUpNumber(Integer commentUpNumber) {
        this.commentUpNumber = commentUpNumber;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Integer getImmediateNumber() {
        return immediateNumber;
    }

    public void setImmediateNumber(Integer immediateNumber) {
        this.immediateNumber = immediateNumber;
    }
}
