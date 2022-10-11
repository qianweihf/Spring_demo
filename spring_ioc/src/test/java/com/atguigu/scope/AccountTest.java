package com.atguigu.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-26
 */
public class AccountTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account account1 = ctx.getBean("account", Account.class);
//        Account account2 = ctx.getBean("account", Account.class);
//
//        System.out.println("account1 = " + account1);
//        System.out.println("account2 = " + account2);
        ctx.close();
    }

}