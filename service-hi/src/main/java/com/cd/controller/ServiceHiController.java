/**
 * Copyright (C), 2016-2019
 * FileName: ServiceHiController
 * Author:   cd
 * Date:     2019/7/18 10:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 服务接口
 * @author cd
 * @create 2019/7/18 10:07
 * @since 1.0.0
 */
@RestController
public class ServiceHiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("hi")
    @HystrixCommand(fallbackMethod = "error")
    public String home(@RequestParam(value = "name", defaultValue = "cd") String name){
        return "hi "+ name +", i am from port: "+ port;
    }

    public String error(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
