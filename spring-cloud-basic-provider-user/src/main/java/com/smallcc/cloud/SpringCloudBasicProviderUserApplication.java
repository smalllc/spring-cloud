package com.smallcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringCloudBasicProviderUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudBasicProviderUserApplication.class, args);
  }
}
