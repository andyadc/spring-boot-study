package com.andyadc.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author andaicheng
 * @since 2018/1/7
 */
@Component
public class CustomConfig {

    @Value("${local.ip}")
    private String ip;

    public void show() {
        System.out.println("local ip: " + ip);
    }
}
