package com.andyadc.boot.quickstart.config;

import com.andyadc.boot.quickstart.repository.MyBatisRepository;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    /**
     * - 设置SqlSessionFactory；
     * - 设置dao所在的package路径；
     * - 关联注解在dao类上的Annotation名字；
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.andyadc.study");
        configurer.setAnnotationClass(MyBatisRepository.class);
        return configurer;
    }
}
