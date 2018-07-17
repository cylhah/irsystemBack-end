package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.CommentDao;
import com.cylwyc.demo.dao.CommentUpDao;
import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.domain.CommentUp;
import com.cylwyc.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Autowired
    private CommentUpDao commentUpDao;

    @Override
    public List<Comment> getCommentByAticleId(int articleId, int page,int userId) {
        List<Comment> comments = commentDao.queryCommentByArticleId(articleId,page*10);
        CommentUp commentUp = new CommentUp();
        int i ,j ;
        for (i=0;i<comments.size();i++){
            commentUp.setCommentId(comments.get(i).getCommentId());
            commentUp.setUserId(userId);
            j = commentUpDao.selectCommentUp(commentUp);
            if (j==1){
                comments.get(i).setUpEd(true);
            }
            else {
                comments.get(i).setUpEd(false);
            }
        }
        return comments;
    }

    /**
     *
     * @param comment 评论对象(userId,commentId,commentText)
     *                需设置commentTime,commentType=0,immediateNumber
     * @return
     */
    @Override
    public int commentArticle(Comment comment) {
        if (comment.getCommentText()!=null&& !"".equals(comment.getCommentText())){
            comment.setCommentTime(new Date());
            comment.setImmediateNumber(0);
            comment.setCommentType(0);
            int i = commentDao.insertComment(comment);
            return i;
        }
        else{
            return 0;
        }
    }

    /**
     *
     * @param comment 评论对象(userId,commentId,targetCommentId,replyCommentId,commentText)
     *                需设置commentTime,commentType=1,immediateNumber
     * @return
     */
    @Override
    public int replyArticleComment(Comment comment) {
        if (comment.getCommentText()!=null&& !"".equals(comment.getCommentText())){
            comment.setCommentTime(new Date());
            comment.setImmediateNumber(0);
            comment.setCommentType(1);
            int i = commentDao.insertComment(comment);
            return i;
        }
        else{
            return 0;
        }
    }

    /**
     *
     * @param comment 评论对象(userId,commentId,targetCommentId,replyCommentId,commentText)
     *                需设置commentTime,commentType=2,immediateNumber
     * @return
     */
    @Override
    public int replyCommentComment(Comment comment) {
        if (comment.getCommentText()!=null&& !"".equals(comment.getCommentText())){
            comment.setCommentTime(new Date());
            comment.setImmediateNumber(0);
            comment.setCommentType(2);
            int i = commentDao.insertComment(comment);
            return i;
        }
        else{
            return 0;
        }
    }

    /**
     *
     * @param commentId 父评论的id
     * @return
     */
    @Override
    public List<Comment> getCommentChild(int commentId , int page,int userId) {
        if (commentId>0){
         List<Comment> comments = commentDao.queryCommentChildById(commentId,page*10);
            CommentUp commentUp = new CommentUp();
            int t,j ;
            for (t=0;t<comments.size();t++){
                commentUp.setUserId(userId);
                commentUp.setCommentId(comments.get(t).getCommentId());
                j = commentUpDao.selectCommentUp(commentUp);
                if (j==1){
                    comments.get(t).setUpEd(true);
                }
                else {
                    comments.get(t).setUpEd(false);
                }
            }
         return comments;
        }
        return null;
    }

    @Override
    public List<Comment> getUserCommentToArticle(int userId) {
        return commentDao.queryUserCommentToArticle(userId);
    }

    @Override
    public int updateCommentImmediate(int replyCommentId){
        int i = commentDao.updateCommentImmediate(replyCommentId);
        return i;
    }
}
