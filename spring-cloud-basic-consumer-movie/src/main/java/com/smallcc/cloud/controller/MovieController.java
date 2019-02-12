package com.smallcc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.smallcc.cloud.entity.User;

@RestController
public class MovieController {
  private final RestTemplate restTemplate;


  @Autowired
  public MovieController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://spring-cloud-basic-provider-user/simple/" + id, User.class);
  }
}
