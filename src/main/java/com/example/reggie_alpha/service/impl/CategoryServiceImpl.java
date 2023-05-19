package com.example.reggie_alpha.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_alpha.common.CustomException;
import com.example.reggie_alpha.entity.Category;
import com.example.reggie_alpha.entity.Dish;
import com.example.reggie_alpha.entity.Setmeal;
import com.example.reggie_alpha.mapper.CategoryMapper;
import com.example.reggie_alpha.service.CategoryService;
import com.example.reggie_alpha.service.DishService;
import com.example.reggie_alpha.service.SetMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;
    @Autowired
    private SetMealService setMealService;

    @Override
    public void remove(Long id) {
        // 查询是否关联了菜品
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = (int) dishService.count(dishLambdaQueryWrapper);
        if (count1 > 0) {
            throw new CustomException("当前分类项关联了菜品，不能删除");
        }
        // 查询是否关联了套餐
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = (int) setMealService.count(setmealLambdaQueryWrapper);
        if (count2 > 0) {
            throw new CustomException("当前分类项关联了套餐，不能删除");
        }
        // 都没关联，正常删除
        super.removeById(id);
    }
}
