package com.shreddedcoderx.bean;

import com.shreddedcoderx.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto(){
        return BeanDto
                .builder()
                    .id(0L).beanName("Bean Name").beanData("Bean Data")
                .build();
    }

}
