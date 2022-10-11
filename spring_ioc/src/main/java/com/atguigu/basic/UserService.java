package com.atguigu.basic;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public interface UserService {
    public void register(User user);

    public void login(String username,String password);
}
