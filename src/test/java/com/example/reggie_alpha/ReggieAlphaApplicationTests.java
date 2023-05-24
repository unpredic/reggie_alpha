package com.example.reggie_alpha;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.reggie_alpha.entity.User;
import com.example.reggie_alpha.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootTest
@Slf4j
class ReggieAlphaApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(applicationContext);
        System.out.println(applicationContext.getBeanDefinitionCount());
        MybatisPlusInterceptor bean = applicationContext.getBean(MybatisPlusInterceptor.class);
        System.out.println(bean);
    }

    @Test
    void demo() {

    }

}
