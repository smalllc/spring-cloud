package com.smallcc.cloud.feign.impl;

import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

 /**
  * @description feign 整合实现回调 hystrix方法
  * @author 晓风过境
  * @date 2019/1/19 16:45
  * @return com.smallcc.cloud.feign.impl
  * @title com.smallcc.cloud.feign.impl
  * @project_name HystrixClientFallback.java
  */
 @Component
public class HystrixClientFallback implements UserFeignClient {

    @Override
    public User findByUserId(Long Id) {
        User user = new User();
        user.setName("smallcc");
        user.setBalance(new BigDecimal(100));
        return user;
    }
}