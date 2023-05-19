package com.example.reggie_alpha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_alpha.entity.Dish;
import com.example.reggie_alpha.mapper.DishMapper;
import com.example.reggie_alpha.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
