package com.atguigu.proxy;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-06
 */
public class UserServiceImpl implements UserService{
    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl.register 业务运算 + DAO操作");
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("UserServiceImpl.login");
        return true;
    }
}
