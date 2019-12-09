package com.example.demo.mapper;

import com.example.demo.domain.Premission;
import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    public User findByUserName(String userName);


    List<Premission> findPreMissionByUserName(String userName);
}
