package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
通过这个注解向服务中心注册，并且向程序注入一个bean：restTemplate
通过
 */
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class BootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }

    /*
    @LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
