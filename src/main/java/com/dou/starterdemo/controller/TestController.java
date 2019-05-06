package com.dou.starterdemo.controller;

import com.dou.helloworldsatarter.bean.HelloWorldBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

  @Autowired
  private HelloWorldBean helloWorldBean;

  @GetMapping("/ping")
  public String ping() {
    LOGGER.info("Ping ");
    return "pong";
  }

  @GetMapping("/hello")
  public void sayHello() {
    helloWorldBean.sayHello();
  }

}
