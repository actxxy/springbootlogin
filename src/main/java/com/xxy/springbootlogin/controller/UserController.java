package com.xxy.springbootlogin.controller;

import com.xxy.springbootlogin.entity.User;
import com.xxy.springbootlogin.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServer userServer;
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userServer.findAll();
    }


}
