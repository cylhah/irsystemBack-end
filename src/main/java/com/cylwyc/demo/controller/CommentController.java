package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/articleComment")
    public List<Comment> getArticleComment(@RequestParam int articleId,@RequestParam int page,@RequestParam int userId){
        List<Comment> comments = commentService.getCommentByAticleId(articleId,page,userId);
        return comments;
    }

    @PostMapping(value = "/commentArticle")
    public int commentArticle (@RequestBody Comment comment){
        int i = commentService.commentArticle(comment);
        return i;
    }

    @PostMapping(value = "/replyArticleComment")
    public int replyArticleComment(@RequestBody Comment comment){
        int i = commentService.replyArticleComment(comment);
        int j = commentService.updateCommentImmediate(comment.getReplyCommentId());
        if (i==1&&j==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    @PostMapping(value = "/replyCommentComment")
    public int replyCommentComment(@RequestBody Comment comment){
        int i = commentService.replyCommentComment(comment);
        int j = commentService.updateCommentImmediate(comment.getReplyCommentId());
        if (i==1&&j==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    @PostMapping(value = "/getCommentChild")
    public List<Comment> getCommentChild(@RequestParam int commentId,@RequestParam int page,@RequestParam int userId){
        List<Comment> comments = commentService.getCommentChild(commentId,page,userId);
        return comments;
    }

    @GetMapping(value = "/userId/{userId}")
    public List<Comment> getUserCommentToArticle(@PathVariable("userId") int userId){
        return commentService.getUserCommentToArticle(userId);
    }
}
