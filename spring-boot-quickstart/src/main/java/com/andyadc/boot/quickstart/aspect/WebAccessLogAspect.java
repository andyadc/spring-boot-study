package com.andyadc.boot.quickstart.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author andaicheng
 * @version 2016/11/30
 */
@Aspect
@Component
public class WebAccessLogAspect {

    private static final Logger LOG = LoggerFactory.getLogger(WebAccessLogAspect.class);

    private ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    @Pointcut("execution(public * com.andyadc.study.springboot.quickstart.web.controller..*.*(..))")
    public void accessLog() {
        // NO-OP
    }

    @Before("accessLog()")
    public void doBefore() {
        startTime.set(System.currentTimeMillis());
    }

    @AfterReturning(returning = "ret", pointcut = "accessLog()")
    public void doAfterReturning(Object ret) {
        LOG.info("Response: {}, Elapsed time: {}ms", ret, System.currentTimeMillis() - startTime.get());
    }
}
