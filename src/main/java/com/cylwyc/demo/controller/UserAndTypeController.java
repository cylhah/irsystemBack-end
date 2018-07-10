package com.cylwyc.demo.controller;

import com.cylwyc.demo.dao.UserAndTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userAndType")
public class UserAndTypeController {

    @Autowired
    private UserAndTypeDao userAndTypeDao;
}
