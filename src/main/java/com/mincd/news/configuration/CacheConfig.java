package com.mincd.news.configuration;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Caching Configuration
 */
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {

    public static final String TIMEOUT_CACHE_MANAGER = "timeoutCacheManager";
    public static final int EXPIRATION_TIME_IN_MINUTES = 1;
    public static final int MAXIMUM_CACHE_SIZE = 100;

    @Override
    @Bean
    public CacheManager cacheManager() {
        return new GuavaCacheManager();
    }

    /**
     * Configures the Caching properties
     *
     * @return
     */
    @Bean
    public CacheManager timeoutCacheManager() {
        GuavaCacheManager cacheManager = new GuavaCacheManager();
        CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder()
                .maximumSize(MAXIMUM_CACHE_SIZE)
                .expireAfterWrite(EXPIRATION_TIME_IN_MINUTES, TimeUnit.MINUTES);
        cacheManager.setCacheBuilder(cacheBuilder);
        return cacheManager;
    }

}

