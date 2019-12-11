package com.example.demo.security;


import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


public class MyUserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("+++++++++++++++++++++++");
        User user = userMapper.findByUserName(username);
        List<String> premissionList = userMapper.findPreMissionByUserName(username);

        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();

        for(String pre:premissionList){
                list.add(new SimpleGrantedAuthority(pre));
        }
        user.setAuthorities(list);

        System.out.println("=========================="+user);
        return user;
    }
}
