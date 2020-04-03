package com.lk.aggregation.repository.impl;

import com.lk.aggregation.model.UserInfo;
import com.lk.aggregation.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public UserInfo getUserInfo() {
        UserInfo user = new UserInfo();
        user.setId(UUID.randomUUID().getLeastSignificantBits());
        user.setPassword("password");
        user.setPhoneNumber("133*******0");
        user.setUserName("lk");
        return user;
    }
}
