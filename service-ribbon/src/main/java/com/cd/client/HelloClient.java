/**
 * Copyright (C), 2016-2019
 * FileName: HelloClient
 * Author:   cd
 * Date:     2019/7/18 10:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @desc 调用服务hi
 * @author cd
 * @create 2019/7/18 10:29
 * @since 1.0.0
 */
@Service
public class HelloClient {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")//@HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String error(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
