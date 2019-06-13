package com.xxy.springbootlogin.server;

import com.xxy.springbootlogin.entity.Goods;

import java.util.List;

public interface GoodsServer {
    List<Goods>  findAll();
}
