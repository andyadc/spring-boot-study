package com.andyadc.study.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@SpringBootApplication
@EnableScheduling
public class App {

    @Bean
    public Filter characterEncodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
