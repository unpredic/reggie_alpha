package com.example.reggie_alpha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_alpha.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
