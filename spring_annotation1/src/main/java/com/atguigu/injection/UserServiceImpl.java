package com.atguigu.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qianwei
 * @create 2022-11-02 V1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

//    public UserMapper getUserMapper() {
//        return userMapper;
//    }
//
//
//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Override
    public void register() {
        userMapper.save();
    }
}
