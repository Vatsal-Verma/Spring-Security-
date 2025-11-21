package com.SpringSec.SpringSecEx.Controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CheckController {
    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "welcome to my springboot application " + request.getSession().getId();
    }
    
    
}
