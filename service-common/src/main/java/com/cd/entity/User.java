/**
 * Copyright (C), 2016-2019
 * FileName: User
 * Author:   cd
 * Date:     2019/7/23 16:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         版本号            描述
 */
package com.cd.entity;

import lombok.Data;

/**
 * @desc
 * @author cd
 * @create 2019/7/23 16:24
 * @since 1.0.0
 */
@Data
public class User {

    private Long id;
    private String name;
    private String desc;
}
