package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
     User selectByUserName(String userName);

     List<String> findPreMissionByUserName(String userName);
}
