package com.andyadc.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andaicheng
 * @since 2018/1/8
 */
@Component
@ConfigurationProperties(prefix = "local")
public class PrefixConfig {

    private String ip;

    private String flag;

    private List<String> ports = new ArrayList<>();

    private String[] hosts;

    public void show() {
        System.out.println("prefix ip " + ip);
        System.out.println("prefix flag " + flag);
        System.out.println("prefix ports " + ports);
        System.out.println("prefix hosts " + hosts);
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public void setHosts(String[] hosts) {
        this.hosts = hosts;
    }
}
