package com.smallcc.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
  * @description  zuul 启动注解 其实包含了 eureka + hystrix
  * @author 晓风过境
  * @date 2019/1/21 21:46
  * @param
  * @return com.smallcc.cloud
  * @title com.smallcc.cloud
  * @project_name ZuulApplication.java
  */
@SpringBootApplication
//@EnableEurekaServer
@EnableZuulProxy
public class ZuulRegApplication {
  public static void main(String[] args) {

     new SpringApplicationBuilder(ZuulRegApplication.class).web(true).run(args);
  }
     @Bean
     public PatternServiceRouteMapper serviceRouteMapper() {
         return new PatternServiceRouteMapper(
                 "(?<name>^.+)-(?<version>v.+$)",
                 "${version}/${name}");
     }
}
