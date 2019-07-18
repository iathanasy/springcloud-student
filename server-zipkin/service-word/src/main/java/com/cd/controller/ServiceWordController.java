/**
 * Copyright (C), 2016-2019
 * FileName: ServiceWordController
 * Author:   cd
 * Date:     2019/7/18 11:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc
 * @author cd
 * @create 2019/7/18 11:51
 * @since 1.0.0
 */
@RestController
public class ServiceWordController {
    private static final Logger log = LoggerFactory.getLogger(ServiceWordController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/word")
    public String callHome(){
        log.info( "calling trace service-word ");
        return restTemplate.getForObject("http://127.0.0.1:8988/info", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        log.info( "i'm service-word");
        return "i'm service-word";

    }
}
