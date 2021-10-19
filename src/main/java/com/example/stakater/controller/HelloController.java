package com.example.stakater.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${company.name}")
    String appName;

    @GetMapping("/")
    public String hello() {
        return "home" + appName;
    }
}
