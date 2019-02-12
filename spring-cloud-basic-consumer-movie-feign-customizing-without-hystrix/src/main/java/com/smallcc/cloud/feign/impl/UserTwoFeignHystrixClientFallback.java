package com.smallcc.cloud.feign.impl;

import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.UserFeignClient;
import com.smallcc.cloud.feign.UserTwoFeignClient;
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
public class UserTwoFeignHystrixClientFallback implements UserTwoFeignClient {
    @Override
    public User findByUserID(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("lc");
        return user;
    }
}
