package com.andyadc;

import com.andyadc.boot.CustomConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        context.getBean(CustomConfig.class).show();

        context.close();
    }
}
