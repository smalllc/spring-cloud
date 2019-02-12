package com.smallcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

 /**
  *
  * @author 晓风过境
  * @date 2019/1/24 21:20
  */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientRefreshApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientRefreshApplication.class, args);
  }
}
