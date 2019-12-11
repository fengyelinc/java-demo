package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/user")
@Api(description = "用户相关接口")
public class UserController {

@Autowired(required=true)
private UserServiceImpl userServiceImpl;

   @GetMapping(value = "/home")
   @ApiOperation("主页接口")
    public User homePage(){
       User user = userServiceImpl.selectByUserName("ww");
       System.out.println("``````````````succcess");
       return user;

    }


    @PostMapping(value = "/findUser")
    @ApiOperation("获取用户信息")
    public User findUser(@ApiParam("获取的用户")String username){
        User user = userServiceImpl.selectByUserName("username");
        return user;
    }




}
