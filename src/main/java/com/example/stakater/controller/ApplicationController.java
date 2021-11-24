package com.example.stakater.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @CrossOrigin(origins = {"http://localhost:3000"})
    @GetMapping("/sayhello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Stakater") String name) {
        return "Hello "+name;
    }
}
