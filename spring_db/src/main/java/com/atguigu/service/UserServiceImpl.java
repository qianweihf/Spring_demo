package com.atguigu.service;

import com.atguigu.dao.UserDAO;
import com.atguigu.entity.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qianwei
 * @create 2022-10-13 V1.0
 */
@Transactional(isolation= Isolation.READ_COMMITTED)
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;


    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public void login(String name, String password) {

    }
}
