package com.example.reggie_alpha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_alpha.dto.DishDto;
import com.example.reggie_alpha.entity.Dish;

public interface DishService extends IService<Dish> {
    // 新增菜品，同时新增口味
    void saveWithFlavor(DishDto dishDto);

    // 根据id查询菜品信息和口味信息
    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
