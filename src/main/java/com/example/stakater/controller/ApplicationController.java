package com.example.stakater.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Value("${company.name}")
    public String name;

    @CrossOrigin(origins = {"http://localhost:3000"})
    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+(name.equals("") ? this.name : name);
    }
}
