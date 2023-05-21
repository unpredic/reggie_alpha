package com.example.reggie_alpha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_alpha.dto.SetmealDto;
import com.example.reggie_alpha.entity.Setmeal;

import java.util.List;

public interface SetMealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);
    void removeWithDish(List<Long> ids);
}
