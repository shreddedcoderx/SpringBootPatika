package com.shreddedcoderx.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

/*    @Autowired
    Logger LOG;*/

/*    public PostConstructTutorials() {
        LOG.info("Log info çağrıldı.");
    }*/

    // Bean henüz başlamadığından null alıyoruz ve buraaa bağımlılığı enjeckte edemiyoruz.
    // Post Construct ise bir bean nesnesi oluşturulduğunda hemen oluşur.
/*    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı.");
    }*/

/*    public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }*/
}
