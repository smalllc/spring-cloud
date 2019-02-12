package com.smallcc.cloud.feign.impl;

import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.UserFeignClient;
import com.smallcc.cloud.feign.UserFeignFactory;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 晓风过境
 * @description
 * @date 2019/1/19 17:30
 * @day 19
 * @return $text$
 * @title ${CLASS_NAME}
 * @project_name spring-cloud-basic-spring-cloud
 */
@Component
public class HystrixClientFactoryFallback implements FallbackFactory<UserFeignFactory>{
    private static final Logger logger = LoggerFactory.getLogger(HystrixClientFallback.class);
    @Override
    public UserFeignFactory create(Throwable throwable) {
        logger.info("throwable error message : {}",throwable.getMessage());
        return id->{
            User user = new User();
            user.setName("testName");
            user.setId(id);
            return user;
        };
    }
}
