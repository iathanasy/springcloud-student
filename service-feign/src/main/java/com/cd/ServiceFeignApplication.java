/**
 * Copyright (C), 2016-2019
 * FileName: ServiceFeignApplication
 * Author:   cd
 * Date:     2019/7/18 10:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @desc 服务消费者 Feign
 *  在浏览器上多访问几次
 *  http://127.0.0.1:8765/hi?name=cd
 * @author cd
 * @create 2019/7/18 10:39
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //自带断路器 需要在yml中配置开启
public class ServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceFeignApplication.class, args );
    }
}
