package com.andyadc.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author andaicheng
 */
@Controller
public class TemplateController {

    @RequestMapping("/template")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://andyadc.com:8765");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
