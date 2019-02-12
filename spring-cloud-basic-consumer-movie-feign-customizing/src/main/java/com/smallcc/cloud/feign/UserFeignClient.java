package com.smallcc.cloud.feign;

import com.smallcc.cloud.config.UserConfiguration;
import com.smallcc.cloud.entity.User;
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
@FeignClient(name = "spring-cloud-basic-provider-user", configuration = UserConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /simple/{id}")
    User findByUserID(@Param("id") Long id);

}
