/**
 * Copyright (C), 2016-2019
 * FileName: HelloClient
 * Author:   cd
 * Date:     2019/7/18 10:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.client;

import com.cd.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @desc 定义一个feign接口 @FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 * @author cd
 * @create 2019/7/18 10:42
 * @since 1.0.0
 */
@FeignClient(value = "service-hi", fallback = HelloClientHystric.class)//需要指定熔断类
public interface HelloClient {

    @RequestMapping("hi")
    String hi(@RequestParam String name);

    @RequestMapping("get")
    User getUser(@RequestParam(value = "name") String name);
}
