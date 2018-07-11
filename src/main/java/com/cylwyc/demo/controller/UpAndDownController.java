package com.cylwyc.demo.controller;

import com.cylwyc.demo.service.UpAndDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/upAndDown")
public class UpAndDownController {

    @Autowired
    private UpAndDownService upAndDownService;

    @GetMapping(value = "/userId/{userId}/articleId/{articleId}")
    public int getUpAndDown(@PathVariable("userId") int userId,
                            @PathVariable("articleId") int articleId){
        return upAndDownService.getUpAndDown(userId,articleId);
    }

    @PostMapping(value = "/userId/{userId}/articleId/{articleId}/upOrDown/{upOrDown}")
    public int insertUpAndDown(@PathVariable("userId") int userId,
                               @PathVariable("articleId") int articleId,
                               @PathVariable("upOrDown") int upOrDown){
        return upAndDownService.insertUpAndDown(userId, articleId, upOrDown);
    }

    @DeleteMapping(value = "/userId/{userId}/articleId/{articleId}")
    public int deleteUpAndDown(@PathVariable("userId") int userId,
                               @PathVariable("articleId") int articleId){
        return upAndDownService.deleteUpAndDown(userId, articleId);
    }
}
