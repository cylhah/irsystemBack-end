package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.domain.CommentUp;

import java.util.List;

public interface CommentUpService {

    /**
     * 点赞
     * @param commentUp 点赞对象
     * @return 影响的行数，影响为1则成功，0失败
     */
    int insertCommentUp(CommentUp commentUp);

    /**
     * 删除点赞
     * @param commentUp 点赞对象
     * @return 影响的行数，影响为1则成功，0失败
     */
    int deleteCommentUP(CommentUp commentUp);


}
