package com.andyadc.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.concurrent.TimeUnit;

/**
 * @author andaicheng
 * @since 2018/1/6
 */
public class InitAndDestroy implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        TimeUnit.SECONDS.sleep(10);
        System.out.println("---------------Disposable--------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("-------------Initializing----------------");
    }
}
