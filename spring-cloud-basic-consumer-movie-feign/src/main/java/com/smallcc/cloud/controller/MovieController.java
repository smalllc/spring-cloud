package com.smallcc.cloud.controller;

import com.smallcc.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smallcc.cloud.entity.User;

@RestController
public class MovieController {
  private final UserFeignClient userFeignClient;

  @Autowired
  public MovieController(UserFeignClient userFeignClient) {
    this.userFeignClient = userFeignClient;
  }

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignClient.findByUserId(id);
  }
  @PostMapping("/user")
  public User testPost(@RequestBody  User user){
    return this.userFeignClient.toUser(user);
  }

  @GetMapping("/get_user")
  public User testGet(User user){
    return this.userFeignClient.getToUser(user);
  }
}
