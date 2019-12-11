package com.example.demo.mapper;

import com.example.demo.domain.Premission;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserMapper {
     User findByUserName(String userName);


    List<String> findPreMissionByUserName(String userName);

    int addUser(User user);

}
