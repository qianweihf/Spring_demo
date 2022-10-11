package com.atguigu.aspect;

import com.atguigu.proxy.User;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-09
 */
public interface UserService {
    public void login(String name,String password);

    public void register(User user);
}
