/**
 * Copyright (C), 2016-2019
 * FileName: ServiceHelloController
 * Author:   cd
 * Date:     2019/7/18 11:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc
 * @author cd
 * @create 2019/7/18 11:41
 * @since 1.0.0
 */
@RestController
public class ServiceHelloController {

    private static final Logger log = LoggerFactory.getLogger(ServiceHelloController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/home")
    public String callHome(){
        log.info( "calling trace service-hello ");
        return restTemplate.getForObject("http://127.0.0.1:8989/word", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        log.info( "i'm service-hello");
        return "i'm service-hello";

    }
}
