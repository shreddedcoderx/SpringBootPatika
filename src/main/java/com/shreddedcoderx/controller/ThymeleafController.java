package com.shreddedcoderx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://127.0.0.1:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody
    public String getThymeleaf1Model(){
        return "thymeleaf1";
    }

    // http://127.0.0.1:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getTyhmeleaf2Model(Model model){
        model.addAttribute("key_value1", "Ben modelden geldim.1");
        model.addAttribute("key_value2", "Ben modelden geldim.2");
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf3")
    public String getTyhmeleaf3Model(Model model){
        model.addAttribute("key_value1", "Ben modelden geldim.1");
        model.addAttribute("key_value2", "Ben modelden geldim.2");
        model.addAttribute("key_value3", "Ben modelden geldim.3");
        return "thymeleaf_file/thymeleaf3";
    }
}
