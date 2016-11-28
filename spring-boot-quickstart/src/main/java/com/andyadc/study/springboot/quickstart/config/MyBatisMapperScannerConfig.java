package com.andyadc.study.springboot.quickstart.config;

import com.andyadc.study.springboot.quickstart.repository.MyBatisRepository;
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

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.andyadc.study");
        configurer.setAnnotationClass(MyBatisRepository.class);
        return configurer;
    }
}
