package com.smallcc.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
  * @description  配置ribbon
  * project_name RibbonConfig.java
  */
 @Configuration
 @ExcludFromComponentScan
// @RibbonClient(name = "spring-cloud-basic-provider-user",configuration = RibbonConfig.class)
public class RibbonConfig {

     @Bean
    public IRule ribbonRule(){
         return new RandomRule();
     }
}

