package com.atguigu.aspect;

import com.atguigu.proxy.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-09
 */
public class UserServiceImpl implements UserService, ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    @Override
    public void login(String name, String password) {

        System.out.println("UserServiceImpl.login");
    }

    @Override
    public void register(User user) {

        System.out.println("UserServiceImpl.register");
        //调用的是原始对象的login方法  ---> 只完成核心功能
        /*
        设计目的：代理对象的login方法  --->  额外功能 + 核心功能
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService =(UserService)ctx.getBean("userService");
        userService.login();

        Spring工厂是重量级资源，一个应用中，应该只创建一个工厂
         */

        UserService userService = (UserService)ctx.getBean("userService");

        userService.login("admin","admin");
    }
}
