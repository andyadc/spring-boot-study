package com.andyadc.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author andaicheng
 * @since 2018/1/7
 */
@Component
public class EchoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("---EchoBeanFactoryPostProcessor---");
        System.out.println("BeanDefinitionCount=" + beanFactory.getBeanDefinitionCount());
    }
}
