package com.atguigu.basic;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void save(User user) {
        System.out.println("insert into user = " + user);
    }

    @Override
    public void queryUserByUsernameAndPassword(String username, String password) {
        System.out.println("query User username = " + username + " password = " + password);
    }
}
