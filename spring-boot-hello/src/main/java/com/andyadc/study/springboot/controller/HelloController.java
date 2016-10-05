package com.andyadc.study.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andaicheng
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value(value = "${boot.secret}")
    private String secret;

    @RequestMapping({""})
    String hello() {
        return secret;
    }
}