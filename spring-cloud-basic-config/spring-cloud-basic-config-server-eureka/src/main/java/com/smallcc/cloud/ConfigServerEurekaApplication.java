package com.smallcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
  * @description
  * @author 晓风过境
  * @date 2019/1/23 15:11
  * @param
  * @return com.smallcc.cloud
  * @title com.smallcc.cloud
  * @project_name ConfigServerApplication.java
  */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerEurekaApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerEurekaApplication.class, args);
  }
}
