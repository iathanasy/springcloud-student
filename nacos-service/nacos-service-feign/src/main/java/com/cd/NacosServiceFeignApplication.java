package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign调用调试
 * @see feign.SynchronousMethodHandler.executeAndDecode 方法中的client
 * @see feign.Client.Default
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceFeignApplication.class, args);
    }

}
