package com.andyadc.study.springboot.quickstart.repository;

import java.lang.annotation.*;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyBatisRepository {
}
