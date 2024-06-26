package com.victor.vojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.victor.vojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.victor")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.victor.vojbackendserviceclient.service"})
public class VojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VojBackendUserServiceApplication.class, args);
    }

}
