package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author guangpeng he on 2019/11/4
 */
@EnableZuulProxy//设置该类为网关启动类
@EnableAutoConfiguration//将当前所有符合条件的Configuration加载到Sping Boot 的IOC容器中
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class,args);
    }
}