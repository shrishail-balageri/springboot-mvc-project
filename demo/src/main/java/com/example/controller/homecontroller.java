package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to my ecommerce";
    }

    @RequestMapping("/about")
    public String about(){
        return "We are building a ecommerce backend !!!";
    }
    
}
