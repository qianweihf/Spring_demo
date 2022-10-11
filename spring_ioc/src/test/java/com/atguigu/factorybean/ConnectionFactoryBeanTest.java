package com.atguigu.factorybean;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class ConnectionFactoryBeanTest {

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn = " + conn);
    }

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn = " + conn);
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        FactoryBean conn = (FactoryBean) ctx.getBean("&conn");
        System.out.println("conn = " + conn);
    }
}