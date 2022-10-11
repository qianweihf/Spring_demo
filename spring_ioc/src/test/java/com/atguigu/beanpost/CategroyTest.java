package com.atguigu.beanpost;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-04
 */
public class CategroyTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        Categroy categroy = (Categroy) ctx.getBean("c");

        System.out.println("categroy = " + categroy);
    }

}