package com.smallcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudBasicConsumerMovieFeignCustWithoutHystrixApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringCloudBasicConsumerMovieFeignCustWithoutHystrixApplication.class).web(true).run(args);
  }
}
