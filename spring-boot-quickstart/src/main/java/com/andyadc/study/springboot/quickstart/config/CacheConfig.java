package com.andyadc.study.springboot.quickstart.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleCacheManager;

/**
 * @author andaicheng
 * @version 2017/5/26
 */
//@Configuration
//@EnableCaching
public class CacheConfig {

    //@Primary
    //@Bean
    public CacheManager caffeineCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        return cacheManager;
    }
}
