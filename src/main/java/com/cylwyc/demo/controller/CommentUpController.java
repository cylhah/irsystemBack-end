package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.CommentUp;
import com.cylwyc.demo.service.CommentUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commentUp")
public class CommentUpController {

    @Autowired
    private CommentUpService commentUpService;

    @PostMapping(value = "/up")
    public int insertCommentUp(@RequestBody CommentUp commentUp){
        int i = commentUpService.insertCommentUp(commentUp);
        return i;
    }

    @PostMapping(value = "down")
    public int deleteCommentUp(@RequestBody CommentUp commentUp){
        int i = commentUpService.deleteCommentUP(commentUp);
        return i;
    }
}
