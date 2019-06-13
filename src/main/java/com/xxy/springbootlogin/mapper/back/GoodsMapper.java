package com.xxy.springbootlogin.mapper.back;

import com.xxy.springbootlogin.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> findAll();
}
