package com.example.reggie_alpha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_alpha.entity.User;
import com.example.reggie_alpha.mapper.UserMapper;
import com.example.reggie_alpha.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
