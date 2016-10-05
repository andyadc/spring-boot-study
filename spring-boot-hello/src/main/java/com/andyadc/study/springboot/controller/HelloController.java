package com.andyadc.study.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author andaicheng
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value(value = "${boot.secret}")
    private String secret;

    @RequestMapping("")
    public String hello() {
        return "Hello";
    }

    @RequestMapping({"/secret"})
    String secret() {
        return secret;
    }

    @RequestMapping("/time")
    public Object time() {
        return new Date();
    }
}
