package com.common.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("recom.redis")
public class RedisProperties {
    private String ip;
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int maxWaitMillis;
    private boolean testOnBorrow;
    private int conntionTimeOut;
    private int soTimeout;
    private int maxAttempts;

    public int getConntionTimeOut() {
        return conntionTimeOut;
    }

    public void setConntionTimeOut(int conntionTimeOut) {
        this.conntionTimeOut = conntionTimeOut;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

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

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(int maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }
}
