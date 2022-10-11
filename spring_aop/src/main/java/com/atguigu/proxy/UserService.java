package com.atguigu.proxy;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-06
 */
public interface UserService {
    public void register(User user);

    public boolean login(String username,String password);
}
