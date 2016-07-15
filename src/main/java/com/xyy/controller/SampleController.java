package com.xyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "this is home!";
    }

    @RequestMapping("/test")
    String test() {
        return "index/text";
    }

}

