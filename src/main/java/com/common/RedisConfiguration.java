package com.common;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public RedisConfig redisConfig(RedisProperties redisProperties){
        RedisConfig config = new RedisConfig();
        config.setIp(redisProperties.getIp());
        config.setName(redisProperties.getName());
        return config;
    }
}
