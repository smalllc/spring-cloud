package com.smallcc.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
  * @description
  * @author 晓风过境
  * @date 2019/1/22 22:34
  * @param
  * @return com.smallcc.cloud
  * @title com.smallcc.cloud
  * @project_name ZuulApplication.java
  */
@SpringBootApplication
//@EnableEurekaServer
@EnableSidecar
public class SidecarApplication {
  public static void main(String[] args) {

      new SpringApplicationBuilder(SidecarApplication.class).web(true).run(args);
  }
}
