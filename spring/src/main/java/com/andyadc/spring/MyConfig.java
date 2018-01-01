package com.andyadc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author andaicheng
 * @since 2018/1/1
 */
@Configuration
public class MyConfig {

    @Bean
    //@Scope(value = "prototype")
    @Scope(value = "singleton")
    public MyBean createBean() {
        return new MyBean();
    }
}
