package com.example.FirtsSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1")

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Helloooooooo, oooooo";
    }
}
