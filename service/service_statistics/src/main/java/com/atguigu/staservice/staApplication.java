package com.atguigu.staservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients // nacos服务发现
@EnableDiscoveryClient // nacos服务注册
@MapperScan("com.atguigu.staservice.mapper")
@ComponentScan("com.atguigu")
@EnableScheduling
public class staApplication {
    public static void main(String[] args) {
        SpringApplication.run(staApplication.class,args);
    }
}
