package com.smallcc.cloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.smallcc.cloud.entity.User;
import com.smallcc.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {

  private final UserRepository userRepository;

  private final EurekaClient eurekaClient;

  private final DiscoveryClient discoveryClient;

  @Autowired
  public UserController(UserRepository userRepository, @Qualifier("eurekaClient") EurekaClient eurekaClient, DiscoveryClient discoveryClient) {
    this.userRepository = userRepository;
    this.eurekaClient = eurekaClient;
    this.discoveryClient = discoveryClient;
  }

  @GetMapping("/simple/{id}")
  public User findById(@PathVariable Long id) {
    return this.userRepository.findOne(id);
  }

  @GetMapping("/eureka-instance")
  public String serviceUrl() {
    return  this.eurekaClient.getNextServerFromEureka("SPRING-CLOUD-BASIC-PROVIDER-USER", false).getHomePageUrl();
  }

  @GetMapping("/instance-info")
  public ServiceInstance showInfo() {
    return this.discoveryClient.getLocalServiceInstance();
  }

  @PostMapping("/user")
  public User postUser(@RequestBody User user) {
    return user;
  }

  // 该请求不会成功
  @GetMapping("/get_user")
  public User getUser(User user) {
    return user;
  }

  @GetMapping("list-all")
  public List<User> listAll() {
    ArrayList<User> list = Lists.newArrayList();
    User user = new User(1L, "zhangsan");
    User user2 = new User(2L, "zhangsan");
    User user3 = new User(3L, "zhangsan");
    list.add(user);
    list.add(user2);
    list.add(user3);
    return list;

  }
}
