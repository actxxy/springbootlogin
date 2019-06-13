package com.xxy.springbootlogin.controller;

import com.xxy.springbootlogin.entity.Goods;
import com.xxy.springbootlogin.server.GoodsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsServer goodsServer;

    @RequestMapping("/getGoodsList")
    public List<Goods> getGoodsList(){
        return goodsServer.findAll();
    }

}
