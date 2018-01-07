package com.andyadc.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author andaicheng
 * @since 2018/1/7
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("EchoBeanPostProcessor postProcessBeforeInitialization [" + bean + "] [" + beanName + "]");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("EchoBeanPostProcessor postProcessAfterInitialization [" + bean + "] [" + beanName + "]");
        return bean;
    }
}
