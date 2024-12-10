package com.kh.ci_cd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String greeting() {
        return "Welcome to see you!";
    }

}
