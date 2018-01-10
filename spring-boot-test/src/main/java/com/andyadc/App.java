package com.andyadc;

import com.andyadc.boot.CustomConfig;
import com.andyadc.boot.EncodingConvert;
import com.andyadc.boot.JdbcConfig;
import com.andyadc.boot.MyImportSelector;
import com.andyadc.boot.PrefixConfig;
import com.andyadc.boot.Selector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 */
@Import(MyImportSelector.class)
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        context.getBean(CustomConfig.class).show();
        context.getBean(JdbcConfig.class).show();
        context.getBean(PrefixConfig.class).show();

        System.out.println(context.getBeansOfType(EncodingConvert.class));

        System.out.println(context.getBean(Selector.class));
        context.close();
    }
}
