package com.ch.boot002.controller;


import com.ch.boot002.util.ResultJson;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/hello")
    public ResultJson hello(){
        return new ResultJson("jack","beijing",25);
    }


    @GetMapping("/home")
    public ModelAndView helloJsp(){
        ResultJson resultJson = new ResultJson("tomcat","beijing",45);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("res",resultJson);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/in")
    public String getHello(Model model){
        model.addAttribute("res","success");
        return "index";
    }
    //test  sourceTree
    @GetMapping("/ik")
    public String getSomething(){
        return "something";
    }
}
