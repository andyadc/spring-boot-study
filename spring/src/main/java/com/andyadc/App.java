package com.andyadc;

import com.andyadc.spring.MyBean;
import com.andyadc.spring.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("createBean"));

    }
}
