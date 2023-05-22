package com.example.reggie_alpha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_alpha.entity.Orders;

public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}
