package com.xxy.springbootlogin.server.impl;

import com.xxy.springbootlogin.entity.User;
import com.xxy.springbootlogin.mapper.primary.UserMapper;
import com.xxy.springbootlogin.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
