package com.andyadc;

import com.andyadc.spring.MyBean;
import com.andyadc.spring.MyFactoryBean;
import com.andyadc.spring.People;
import com.andyadc.spring.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.andyadc.spring");
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("mybean"));

        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean("myFactoryBean"));

        System.out.println(context.getBean(MyFactoryBean.class));
        System.out.println(context.getBean("&myFactoryBean"));

        System.out.println(context.getBean(People.class).getName());

        context.close();
    }
}
