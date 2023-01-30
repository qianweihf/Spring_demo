package com.atguigu.service;

import com.atguigu.entity.User;

/**
 * @author qianwei
 * @create 2022-10-13 V1.0
 */
public interface UserService {
    public void register(User user);

    public void login(String name,String password);
}
