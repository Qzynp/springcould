package com.example.users.controller;

import com.example.users.domain.User;
import com.example.users.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author QZY
 * @date 2021/12/15 10:50
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public List<User> users() {
        System.err.println("users1");
        return userMapper.findAll();
    }
}
