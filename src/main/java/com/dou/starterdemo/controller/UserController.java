package com.dou.starterdemo.controller;

import com.dou.countsarter.service.DbCountService;
import com.dou.starterdemo.entity.User;
import com.dou.starterdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private DbCountService countService;

  @GetMapping
  public List<User> getAll() {
    countService.printCount();
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

}
