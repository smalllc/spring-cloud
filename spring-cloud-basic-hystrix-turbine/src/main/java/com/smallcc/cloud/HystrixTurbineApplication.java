package com.smallcc.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class HystrixTurbineApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(HystrixTurbineApplication.class).web(true).run(args);
  }
}
