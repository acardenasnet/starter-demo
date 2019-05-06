package com.dou.starterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class StarterDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(StarterDemoApplication.class, args);
  }

}
