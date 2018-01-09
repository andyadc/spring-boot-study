package com.andyadc.boot;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author andaicheng
 * @since 2018/1/9
 */
//@Conditional(UTF8Condition.class)
@SpringBootConfiguration
public class EncodingConvertConfiguration {

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvert buildUTF8() {
        return new UTF8EncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvert buildGBK() {
        return new GBKEncodingConvert();
    }
}
