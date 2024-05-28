package com.victor.vojbackendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VojBackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(VojBackendGatewayApplication.class, args);
    }

}
