package com.shreddedcoderx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://127.0.0.1:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody
    public String getThymeleaf1(){
        return "thymeleaf1";
    }
}
