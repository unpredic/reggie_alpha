package com.example.reggie_alpha.controller;

import com.example.reggie_alpha.common.R;
import com.example.reggie_alpha.entity.User;
import com.example.reggie_alpha.service.EmployeeService;
import com.example.reggie_alpha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UserService userService;

    @GetMapping("/demo")
    public R<String> demo() {
//        employeeService
        userService.save(new User());
        return R.success("成功");
    }
}
