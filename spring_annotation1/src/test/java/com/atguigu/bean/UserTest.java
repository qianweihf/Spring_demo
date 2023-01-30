package com.atguigu.bean;

import com.atguigu.injection.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @create 2022-11-02 V1.0
 */
public class UserTest {

    /**
     * 测试@Component注解
     */
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = (User) ctx.getBean("user");

        System.out.println("user = " + user);
    }

    /**
     * 用于测试@Autowired
     */
    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userServiceImpl");

        userService.register();
    }
}