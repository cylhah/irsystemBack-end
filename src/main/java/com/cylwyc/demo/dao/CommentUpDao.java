package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.CommentUp;

public interface CommentUpDao {
    int insertCommentUp(CommentUp commentUp);
    int deleteCommentUp(CommentUp commentUp);
    int selectCommentUp(CommentUp commentUp);
}
