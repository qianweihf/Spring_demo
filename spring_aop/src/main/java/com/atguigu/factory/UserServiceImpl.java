package com.atguigu.factory;

import com.atguigu.proxy.User;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-09
 */
public class UserServiceImpl implements UserService{
    @Override
    public void login(String name, String password) {
        System.out.println("UserServiceImpl.login");
    }

    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl.register");
    }
}
