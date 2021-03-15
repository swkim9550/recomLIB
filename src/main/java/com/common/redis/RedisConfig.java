package com.common.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RedisConfig {
    private String ip;
    private String name;
    private Set<HostAndPort> hosts;
    private JedisCluster jedisCluster;

    public JedisCluster getJedisCluster() {
        return jedisCluster;
    }

    public void setJedisCluster(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    public Set<HostAndPort> getHosts() {
        return hosts;
    }

    public void setHosts(Set<HostAndPort> hosts) {
        this.hosts = hosts;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
        String[] nodes = ip.split(",");
        System.out.println("Connection hosts is .."+Arrays.toString(nodes));

        Set<HostAndPort> hosts = new HashSet<HostAndPort>();
        for(String node : nodes){
            String[] oneNode = node.split(":");
            String host = oneNode[0];
            int port = Integer.valueOf(oneNode[1]);
            hosts.add(new HostAndPort(host,port));
        }
        setHosts(hosts);
        redisInit();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{IP="+ip +"  name="+name+"}";
    }

    public void redisInit(){
        JedisCluster jedisCluster = null;
        try{
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(500);
            config.setMaxIdle(100 * 60);
            config.setMaxWaitMillis(5000);
            config.setTestOnBorrow(true);
            setJedisCluster(new JedisCluster(hosts,5000,1000,1,config));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
