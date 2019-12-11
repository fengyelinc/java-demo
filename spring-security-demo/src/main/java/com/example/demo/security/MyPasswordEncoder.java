package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import sun.security.util.Password;


public class MyPasswordEncoder implements PasswordEncoder {



    @Override
    public String encode(CharSequence rawPassword) {
//        return new BCryptPasswordEncoder().encode(rawPassword);
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return new BCryptPasswordEncoder().matches(rawPassword, encodedPassword);
        return encodedPassword.equals(rawPassword.toString());
    }
}
