package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author cd
 * @desc
 * @create 2019/10/14 15:45
 * @since 1.0.0
 */
@EnableZipkinServer
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZipKinApplication.class, args);
    }
}
