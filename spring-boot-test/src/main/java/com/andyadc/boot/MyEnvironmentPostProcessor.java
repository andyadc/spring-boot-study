package com.andyadc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author andaicheng
 * @since 2018/1/8
 */
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        Properties properties = new Properties();
        properties.setProperty("local.name", "nono");
        properties.setProperty("local.ip", "00000000000");
        PropertiesPropertySource propertySource = new PropertiesPropertySource("my", properties);

        environment.getPropertySources().addLast(propertySource);
//        environment.getPropertySources().addFirst(propertySource);
    }
}
