package com.cylwyc.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Comment {

    private Integer commentId;

    private Integer articleId;

    private Integer userId;

    private Integer targetCommentId;

    private Integer replyCommentId;

    private String commentText;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date commentTime;

    private Integer commentUpNumber;

    private Integer commentType;
    //即时回复数
    private Integer immediateNumber;

    private String userName;

    private String replyTo;

    private Integer replyNum;

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    private boolean isUpEd = false;

    private final boolean replyShow = false;

    private  String userHeadUrl;

    private  String reply = "";

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public boolean isUpEd() {
        return isUpEd;
    }

    public void setUpEd(boolean upEd) {
        isUpEd = upEd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHeadUrl() {
        return userHeadUrl;
    }

    public void setUserHeadUrl(String userHeadUrl) {
        this.userHeadUrl = userHeadUrl;
    }

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

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + articleId +
                ", userId=" + userId +
                ", targetCommentId=" + targetCommentId +
                ", replyCommentId=" + replyCommentId +
                ", commentText='" + commentText + '\'' +
                ", commentTime=" + commentTime +
                ", commentUpNumber=" + commentUpNumber +
                ", commentType=" + commentType +
                ", immediateNumber=" + immediateNumber +
                ", userName='" + userName + '\'' +
                ", replyTo='" + replyTo + '\'' +
                ", replyNum=" + replyNum +
                ", isUpEd=" + isUpEd +
                ", replyShow=" + replyShow +
                ", userHeadUrl='" + userHeadUrl + '\'' +
                ", reply='" + reply + '\'' +
                '}';
    }
}
