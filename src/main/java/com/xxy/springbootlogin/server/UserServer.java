package com.xxy.springbootlogin.server;

import com.xxy.springbootlogin.entity.User;

import java.util.List;

public interface UserServer {
    List<User> findAll();
}
