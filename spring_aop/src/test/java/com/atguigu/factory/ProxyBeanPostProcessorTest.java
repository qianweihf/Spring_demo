package com.atguigu.factory;

import com.atguigu.proxy.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-09
 */
public class ProxyBeanPostProcessorTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.login("admin","admin");
        userService.register(new User());
    }

}