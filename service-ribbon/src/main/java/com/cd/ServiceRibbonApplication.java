/**
 * Copyright (C), 2016-2019
 * FileName: ServiceRibbonApplication
 * Author:   cd
 * Date:     2019/7/18 10:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @desc 服务消费者 rest+Ribbon
 *
 * 在浏览器上多访问几次
 * http://127.0.0.1:8764/hi?name=cd
 * @author cd
 * @create 2019/7/18 10:26
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //开启Hystrix
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class, args );
    }

    /**
     *
     * @return
     */
    @Bean //ioc注入
    @LoadBalanced //表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
