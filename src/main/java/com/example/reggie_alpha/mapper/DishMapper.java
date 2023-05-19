package com.example.reggie_alpha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie_alpha.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
