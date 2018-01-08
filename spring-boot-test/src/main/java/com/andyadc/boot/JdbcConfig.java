package com.andyadc.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Spring Boot 1.5之后取消了 @ConfigurationProperties location配置
 *
 * @author andy.an
 * @since 2018/1/8
 */
@Component
//@ConfigurationProperties()
@PropertySource("classpath:config/jdbc.properties")
public class JdbcConfig {

    @Value("${url}")
    private String url;

    @Value("${driverClassName}")
    private String driverClassName;

    public void show() {
        System.out.println("===========JdbcConfig============");
        System.out.println("url : " + url);
        System.out.println("driverClassName : " + driverClassName);
    }
}
