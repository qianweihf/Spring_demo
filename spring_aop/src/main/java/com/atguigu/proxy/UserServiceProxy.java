package com.atguigu.proxy;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-06
 */
public class UserServiceProxy implements UserService{

    private UserServiceImpl userServiceImpl = new UserServiceImpl();

    @Override
    public void register(User user) {
        System.out.println("---log---");
        userServiceImpl.register(user);
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("---log---");
        return userServiceImpl.login(username,password);
    }
}
