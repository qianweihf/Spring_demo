package com.atguigu.injection;

import org.springframework.stereotype.Repository;

/**
 * @author qianwei
 * @create 2022-11-02 V1.0
 */
@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("UserMapperImpl.save");
    }
}
