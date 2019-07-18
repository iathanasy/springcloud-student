/**
 * Copyright (C), 2016-2019
 * FileName: HelloClientHystric
 * Author:   cd
 * Date:     2019/7/18 10:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.client;

import org.springframework.stereotype.Component;

/**
 * @desc Feign 断路器
 * @author cd
 * @create 2019/7/18 10:59
 * @since 1.0.0
 */
@Component
public class HelloClientHystric implements HelloClient{
    @Override
    public String hi(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
