package com.atguigu.basic;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    @Override
    public void login(String username, String password) {
        userDao.queryUserByUsernameAndPassword(username,password);
    }
}
