package com.smallcc.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.smallcc.cloud.entity.User;

@RestController
public class MovieController {
  private final RestTemplate restTemplate;
  private final LoadBalancerClient loadBalancerClient;

  @Autowired
  public MovieController(RestTemplate restTemplate, LoadBalancerClient loadBalancerClient) {
    this.restTemplate = restTemplate;
    this.loadBalancerClient = loadBalancerClient;
  }

  @GetMapping("/movie/{id}")
  @HystrixCommand(fallbackMethod = "findByIdFallback")
  public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://spring-cloud-basic-provider-user/simple/" + id, User.class);
  }
  public User findByIdFallback(Long id) {
    User user=new User();
    user.setAge((short)1);
    user.setId(id);
    return user;
  }



  @GetMapping("/ribbon")
  public String  ribbonTest(){
    ServiceInstance serviceInstance = this.loadBalancerClient.choose("spring-cloud-basic-provider-user");
    System.out.println(serviceInstance.getHost()+":"+serviceInstance.getHost()+":"+serviceInstance.getServiceId());
    ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("spring-cloud-basic-provider-user2");
    System.out.println(serviceInstance2.getHost()+":"+serviceInstance2.getHost()+":"+serviceInstance2.getServiceId());
    return "this result is over full to console";
  }
}
