package com.atguigu.dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-06
 */
public class Before implements MethodBeforeAdvice {
    /*
    作用：需要把运行在原始方法执行之前运行的额外功能，书写在Before方法中
    Method:额外功能所增加给的那个原始方法，login register
    Object[]:额外功能所增加给的那个原始方法的参数
                login：String username，String password
                register：User user
    Object:额外功能所增加给的那个原始对象  UserServiceImpl OrderServiceImpl
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("-----method before advice log-----");
    }
}
