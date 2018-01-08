package com.andyadc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 两种获取配置的方法
 * 配置文件默认的文件名字为application.properties，
 * 默认的位置在classpath根目录，或者classpath:/config，file:/, file:config/
 * <p>
 * 默认的配置文件名字可以使用--spring.config.name来指定，只需要指定文件的名字，文件扩展名可以省略
 * 默认的配置文件路径可以使用--spring.config.location来指定，配置文件需要指定全路径，包括目录和文件名字，还可以指定多个，多个用逗号隔开
 * 文件的指定方式有两种，1：classpath：2：file：
 *
 * @author andaicheng
 * @since 2018/1/7
 */
@Component
public class CustomConfig {

    @Value("${local.ip}")
    private String ip;

    /**
     * @Value默认必须要有配置项，配置项可以为空。如果没有配置项，则可以给默认值
     */
    @Value("${local.port:321}")
    private String port;

    // 属性注入
    //@Autowired
    private Environment environment;

    //构造器注入
    public CustomConfig(Environment environment) {
        this.environment = environment;
    }

    public void show() {
        System.out.println("local ip: " + ip);
        System.out.println("local port: " + port);

        System.out.println(environment.getProperty("local.flag"));
    }

    //set 注入
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }

}
