package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
@Autowired(required=true)
private UserServiceImpl userServiceImpl;
    @GetMapping("/findByName")
    public User selectByUserName(String userName){
        User user = userServiceImpl.selectByUserName(userName);
        return user;
    }
}
