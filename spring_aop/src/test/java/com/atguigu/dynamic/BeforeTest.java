package com.atguigu.dynamic;

import com.atguigu.proxy.User;
import com.atguigu.proxy.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-06
 */
public class BeforeTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.login("admin","admin");
        userService.register(new User());
    }

}