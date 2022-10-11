package com.atguigu.converter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-03
 */
public class PersonTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println("person = " + person);
    }

}