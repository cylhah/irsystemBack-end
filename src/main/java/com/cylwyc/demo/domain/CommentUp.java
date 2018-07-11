package com.cylwyc.demo.domain;

public class CommentUp {
    private Integer userId;

    private Integer commentId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "CommentUp{" +
                "userId=" + userId +
                ", commentId=" + commentId +
                '}';
    }
}
