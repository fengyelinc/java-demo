package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    
    @Override
    public User selectByUserName(String userName) {
        User user = userMapper.findByUserName(userName);
        return user;
    }

    @Override
    public List<String> findPreMissionByUserName(String userName) {
        List<String> preMissionByUserName = userMapper.findPreMissionByUserName(userName);
        return preMissionByUserName;
    }
}
