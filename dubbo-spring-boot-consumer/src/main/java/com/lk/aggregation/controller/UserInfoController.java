package com.lk.aggregation.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lk.aggregation.model.UserInfo;
import com.lk.aggregation.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Reference   //dubbo的注解
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public UserInfo getUserInfo(){
        return userService.getUserInfo();
    }
}
