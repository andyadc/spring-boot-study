package com.andyadc.study.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andaicheng
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping({""})
    String hello() {
        return "hello";
    }
}
