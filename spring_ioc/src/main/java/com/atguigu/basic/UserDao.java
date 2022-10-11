package com.atguigu.basic;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public interface UserDao {
    public void save(User user);

    public void queryUserByUsernameAndPassword(String username,String password);
}
