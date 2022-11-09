package com.shanzhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApiShanzhuApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiShanzhuApplication.class,args);
    }
}
