package com.shreddedcoderx.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;


    // initial
    public void initialBeanMethod(){
        log.info("Bean başlamadan önce ben varım.");
        System.out.println("Bean başlamadan önce çalışacak method.");
    }

    // end
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra ben varım.");
        System.err.println("Bean bittikten sonra çalışacak method.");
    }
}
