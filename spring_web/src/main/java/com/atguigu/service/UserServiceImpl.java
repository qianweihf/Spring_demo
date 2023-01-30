package com.atguigu.service;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qianwei
 * @create 2022-11-02 V1.0
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void register(User user) {
        userMapper.save(user);
    }
}
