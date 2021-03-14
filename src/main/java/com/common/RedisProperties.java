package com.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import redis.clients.jedis.HostAndPort;

import java.util.Set;

@ConfigurationProperties("recom.redis")
public class RedisProperties {
    private String ip;
    private String name;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
