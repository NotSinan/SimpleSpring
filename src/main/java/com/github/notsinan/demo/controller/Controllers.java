package com.github.notsinan.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    public String getPage() {
        return "Hello";
    }


}
