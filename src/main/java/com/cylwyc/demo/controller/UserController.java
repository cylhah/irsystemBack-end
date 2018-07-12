package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.User;
import com.cylwyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return userService.getUserById(userId);
    }

    @PostMapping(value = "/date")
    List<User> queryUserByDate(@RequestParam("sDate") String sDate,
                               @RequestParam("eDate") String eDate){
        return userService.queryUserByDate(sDate, eDate);
    }
}
