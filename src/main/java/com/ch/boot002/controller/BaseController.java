package com.ch.boot002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


    @GetMapping("/login")
    public String login(){
        return "success";
    }
}
