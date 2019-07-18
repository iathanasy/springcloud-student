/**
 * Copyright (C), 2016-2019
 * FileName: ServiceHiApplication
 * Author:   cd
 * Date:     2019/7/18 10:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @desc 服务提供者
 * 启动eureka-server 工程；启动service-hi工程，它的端口为8762；将service-hi的配置文件的端口改为8763,并启动，
 * 这时你会发现：service-hi在eureka-server注册了2个实例，这就相当于一个小的集群。
 *
 * 加入断路器监控
 * 访问地址：http://127.0.0.1:8762/actuator/hystrix.stream
 * http://127.0.0.1:8762/hystrix
 * @author cd
 * @create 2019/7/18 10:05
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//断路器监控
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }
}
