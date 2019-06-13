package com.xxy.springbootlogin.server.impl;

import com.xxy.springbootlogin.entity.Goods;
import com.xxy.springbootlogin.mapper.back.GoodsMapper;
import com.xxy.springbootlogin.server.GoodsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServerImpl implements GoodsServer {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }
}
