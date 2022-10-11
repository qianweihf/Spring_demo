package com.atguigu.cglib;

import com.atguigu.proxy.User;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-08
 */
public class UserService {

    public void register(User user) {
        System.out.println("UserServiceImpl.register 业务运算 + DAO操作");
    }


    public boolean login(String username, String password) {
        System.out.println("UserServiceImpl.login");
        return true;
    }
}
