package com.andyadc.boot;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author andaicheng
 * @since 2018/1/10
 */
public class MyImportSelector implements ImportSelector {

    /**
     * 方法的返回值必须是class(全称), 该class会被spring容器托管起来
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Selector.class.getName()};
    }
}
