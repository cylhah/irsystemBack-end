package com.cylwyc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TemplateController {

    @GetMapping({"/","index"})
    String index(HttpServletRequest request){
        return "index";
    }
}
