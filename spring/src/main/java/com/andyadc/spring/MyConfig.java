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

    @Bean(name = "mybean")
    //@Scope(value = "prototype")
    @Scope(value = "singleton")
    public MyBean createBean() {
        return new MyBean();
    }

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }

    @Bean
    public InitAndDestroy initAndDestroy() {
        return new InitAndDestroy();
    }
}
