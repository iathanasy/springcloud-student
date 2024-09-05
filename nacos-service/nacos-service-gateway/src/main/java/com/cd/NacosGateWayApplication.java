package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://127.0.0.1:9100/user/1
 * http://127.0.0.1:9100/feign/user/1
 * http://127.0.0.1:9100/feign/userFeign/1
 * http://127.0.0.1:9100/ribbon/user/1
 * @author cd.wang
 * @create 2024-09-05 15:14
 */
@SpringBootApplication
public class NacosGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosGateWayApplication.class, args);
    }
}
