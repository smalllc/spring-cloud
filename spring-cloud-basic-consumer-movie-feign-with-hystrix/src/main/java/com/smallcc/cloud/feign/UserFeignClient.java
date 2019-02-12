package com.smallcc.cloud.feign;

import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.feign.impl.HystrixClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @param
 * @author 晓风过境
 * @description
 * @date 2019/1/17 19:49
 * @return com.smallcc.cloud
 * @title
 * @project_name UserFeignClient.java
 */
@FeignClient(name = "spring-cloud-basic-provider-user" ,fallback = HystrixClientFallback.class)
public interface UserFeignClient {
    // 坑1 不能使用组合注解 如 GetMapping 坑2 是@PathVariable() 变量必须设置
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findByUserId(@PathVariable("id") Long Id);



}
