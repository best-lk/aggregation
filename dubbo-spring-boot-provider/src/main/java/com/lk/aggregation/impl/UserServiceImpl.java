package com.lk.aggregation.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lk.aggregation.model.UserInfo;
import com.lk.aggregation.repository.UserRepository;
import com.lk.aggregation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo getUserInfo() {
        return userRepository.getUserInfo();
    }
}
