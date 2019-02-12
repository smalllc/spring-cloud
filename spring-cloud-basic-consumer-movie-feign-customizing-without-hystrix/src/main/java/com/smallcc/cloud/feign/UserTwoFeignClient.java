package com.smallcc.cloud.feign;

import com.smallcc.cloud.config.UserTwoConfiguration;
import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.impl.UserTwoFeignHystrixClientFallback;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @param
 * @author 晓风过境
 * @description
 * @date 2019/1/17 19:49
 * @return com.smallcc.cloud
 * @title
 * @project_name UserFeignClient.java
 */
@FeignClient(name = "spring-cloud-basic-provider-user", configuration = UserTwoConfiguration.class,fallback = UserTwoFeignHystrixClientFallback.class)
public interface UserTwoFeignClient {

    @RequestLine("GET /simple/{id}")
    User findByUserID(@Param("id") Long id);

}
