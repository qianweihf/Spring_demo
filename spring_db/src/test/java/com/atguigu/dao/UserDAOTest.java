package com.atguigu.dao;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qianwei
 * @create 2022-10-13 V1.0
 */
public class UserDAOTest {

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        User user = new User();
        user.setUsername("xiaowb");
        user.setPassword("98989898");
        user.setEmail("xiaowb@qq.com");

        userService.register(user);
    }

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");

        User user = new User();
        user.setUsername("xiaojr");
        user.setPassword("9999999");
        user.setEmail("xiaojr@qq.com");

        userDAO.save(user);
    }

}
