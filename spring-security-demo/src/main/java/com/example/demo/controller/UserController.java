package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
       return user;

    }


    @PostMapping(value = "/findUser")
    @ApiOperation("获取用户信息")
    public User findUser(@ApiParam("获取的用户")@RequestBody  String username){
        User user = userServiceImpl.selectByUserName(username);
        List<String> preMissionByUserName = userServiceImpl.findPreMissionByUserName(username);

        List<GrantedAuthority> authorities = new ArrayList<>();

        for(String pre:preMissionByUserName){
            authorities.add(new SimpleGrantedAuthority(pre));
        }
        user.setAuthorities(authorities);

        return user;
    }




}
