/**
 * Copyright (C), 2016-2019
 * FileName: ServiceZuulApplication
 * Author:   cd
 * Date:     2019/7/18 11:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @desc 服务网关
 * 访问
 * http://127.0.0.1:8769/api-a/hi?name=cd
 * http://127.0.0.1:8769/api-b/hi?name=cd
 * @author cd
 * @create 2019/7/18 11:10
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceZuulApplication.class, args );
    }
}
