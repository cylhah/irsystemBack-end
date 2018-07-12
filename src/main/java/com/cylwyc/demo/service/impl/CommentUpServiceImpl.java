package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.CommentUpDao;
import com.cylwyc.demo.domain.CommentUp;
import com.cylwyc.demo.service.CommentUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentUpServiceImpl implements CommentUpService {

    @Autowired
    private CommentUpDao commentUpDao;

    @Override
    public int insertCommentUp(CommentUp commentUp) {
        int i = commentUpDao.insertCommentUp(commentUp);
        return i;
    }

    @Override
    public int deleteCommentUP(CommentUp commentUp) {
        int i = commentUpDao.deleteCommentUp(commentUp);
        return i;
    }
}
