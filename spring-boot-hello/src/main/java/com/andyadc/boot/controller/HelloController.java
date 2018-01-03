package com.andyadc.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author andaicheng
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"", "index"})
    public String index(ModelMap map) {
        map.put("now", LocalDate.now());
        return "index";
    }

    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/time")
    public Object time() {
        return LocalDateTime.now();
    }
}
