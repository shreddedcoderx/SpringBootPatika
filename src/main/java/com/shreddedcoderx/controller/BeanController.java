package com.shreddedcoderx.controller;

import com.shreddedcoderx.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;



    //    http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") // url olarak kullanmayı sağlayacak.
    @ResponseBody // html olmadan direk ekranda göster.
    public String getBeanDto(){
        return beanConfig.beanDto() + ".";
    }
}
