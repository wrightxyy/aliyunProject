package com.xyy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public static final String HELLO_WEB = "Hello from local web!";

    @RequestMapping("/")
    public String home() {
        return HELLO_WEB;
    }
}
