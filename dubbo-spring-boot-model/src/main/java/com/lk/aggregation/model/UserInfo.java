package com.lk.aggregation.model;

import lombok.Data;

import java.io.Serializable;

//实体类
@Data
public class UserInfo implements Serializable {

    private Long Id;

    private String userName;

    private String password;

    private String phoneNumber;
}
