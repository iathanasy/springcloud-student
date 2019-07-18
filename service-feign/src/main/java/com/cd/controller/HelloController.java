/**
 * Copyright (C), 2016-2019
 * FileName: HelloController
 * Author:   cd
 * Date:     2019/7/18 10:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.controller;

import com.cd.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author cd
 * @create 2019/7/18 10:43
 * @since 1.0.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloClient helloClient;

    @RequestMapping("hi")
    public String hi(@RequestParam String name){
        return helloClient.hi(name);
    }
}
