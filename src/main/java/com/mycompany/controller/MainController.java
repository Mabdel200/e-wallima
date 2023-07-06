package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/home")
    public String showHomePage(){
        return "home_page";
    }

}
