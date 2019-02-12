package com.smallcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
 /**
  * @description {test}
  * @author 晓风过境
  * @date 2019/1/24 20:33
  * @return com.smallcc.cloud
  * @title com.smallcc.cloud
  * @project_name ConfigServerApplication.java
  */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAuthcApplication {
  public static void main(String[] args) {
      new SpringApplicationBuilder(ConfigServerAuthcApplication.class).web(true).run(args);
  }
}
