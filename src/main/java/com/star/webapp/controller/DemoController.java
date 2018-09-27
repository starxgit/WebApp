package com.star.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("index")
    public String index() {
        System.out.println("访问到了");
        return "demo";
    }
}