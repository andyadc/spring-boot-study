package com.andyadc.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author andaicheng
 * @since 2018/1/6
 */
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
