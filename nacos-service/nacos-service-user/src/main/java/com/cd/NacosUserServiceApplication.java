package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * http://127.0.0.1:8306/user/1
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserServiceApplication.class, args);
    }

}
