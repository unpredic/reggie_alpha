package com.example.reggie_alpha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_alpha.entity.OrderDetail;
import com.example.reggie_alpha.mapper.OrderDetailMapper;
import com.example.reggie_alpha.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
