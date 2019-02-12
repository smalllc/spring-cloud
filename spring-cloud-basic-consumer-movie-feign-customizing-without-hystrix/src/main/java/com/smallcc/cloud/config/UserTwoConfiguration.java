package com.smallcc.cloud.config;

import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.boot.actuate.condition.ConditionalOnEnabledEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
  *
  * @description 自定义配置feign
  * @author 晓风过境
  * @date 2019/1/17 21:42
  * @param
  * @return com.smallcc.cloud.config
  * @title
  * @project_name UserConfigration.java
  */
@Configuration
public class UserTwoConfiguration {
 @Bean
 public Contract feignContract(){
  return new  Contract.Default();
 }
 @Bean
 public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
  return new BasicAuthRequestInterceptor("smallcc", "112211");
 }
 @Bean
 public Logger.Level feignLoggerLevel() {
//  NONE,No logging (DEFAULT). 默认不打印
//  BASIC, 只记录url 在被访问的时候
//  HEADERS, 请求头的
//  FULL; 所有 全部
  return Logger.Level.FULL;
 }

 @Bean
 @Scope("prototype")
 public Feign.Builder feignBuilder(){
  return new Feign.Builder();
 }
}
