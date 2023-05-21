package com.example.reggie_alpha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_alpha.entity.DishFlavor;
import com.example.reggie_alpha.mapper.DishFlavorMapper;
import com.example.reggie_alpha.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
