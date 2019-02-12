package com.smallcc.cloud.feign.impl;

import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author 晓风过境
 * @date 2019/1/19 17:00
 * @param
 * @return com.smallcc.cloud.feign.impl
 * @title com.smallcc.cloud.feign.impl
 * @project_name UserFeignHystrixClientFallback.java
 */
@Component
public class UserFeignHystrixClientFallback implements UserFeignClient {
    @Override
    public User findByUserID(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("smallcc");
        return user;
    }
}
