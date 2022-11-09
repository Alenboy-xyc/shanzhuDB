package com.shanzhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UtilShanzhuApplication {
    public static void main(String[] args) {
        SpringApplication.run(UtilShanzhuApplication.class,args);
    }
}
