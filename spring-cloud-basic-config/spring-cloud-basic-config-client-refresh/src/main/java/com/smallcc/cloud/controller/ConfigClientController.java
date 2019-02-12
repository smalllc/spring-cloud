package com.smallcc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 晓风过境
 * @date 2019/1/23 15:49
 */
@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${profile}")
    private String profile;
    @GetMapping(value = "/profile")
    public String getProfile(){
        return "this result is :"+profile;
    }
}
