package com.javahowtos.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/basicauthdemo")
    public String getSomeResponse() {
        return "Hello!";
    }
}
