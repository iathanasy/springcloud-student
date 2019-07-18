/**
 * Copyright (C), 2016-2019
 * FileName: ServiceWordApplication
 * Author:   cd
 * Date:     2019/7/18 11:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @desc Word服务提供者
 * @author cd
 * @create 2019/7/18 11:49
 * @since 1.0.0
 */
@SpringBootApplication
public class ServiceWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceWordApplication.class, args);
    }

    /**
     *
     * @return
     */
    @Bean //ioc注入
    @LoadBalanced
    //表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
