package com.smallcc.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
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
public class ZuulApplication {
  public static void main(String[] args) {
     new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
  }
}
