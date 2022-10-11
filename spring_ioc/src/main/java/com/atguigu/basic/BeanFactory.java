package com.atguigu.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public class BeanFactory {
    private static Properties env = new Properties();
    static{
        InputStream inputStream = null;
        try {
            //第一步 获得IO输入流
            inputStream = BeanFactory.class.getResourceAsStream("/applicationContext.properties");
            //第二步 文件内容 封装 Properties集合中 key=userService value=com.atguigu.basic.UserServiceImpl
            env.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /*
    对象的创建方式：
        1. 直接调用构造方法 创建对象 UserService userServie = new UserServiceImpl();
        2. 通过反射的形式 创建对象 解耦合
            Class clazz = Class.forName("com.atguigu.basic.UserServiceImpl");
            UserService userService = (UserService)clazz.newInstance();
     */
    public static UserService getUserService(){
        UserService userService = null;
        try {
            Class clazz = Class.forName(env.getProperty("userService"));
            userService = (UserService)clazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return userService;
    }

    public static UserDao getUserDao(){
        UserDao userDao = null;
        try {
            Class clazz = Class.forName(env.getProperty("userDao"));
            userDao = (UserDao)clazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return userDao;
    }

    public static Object getBean(String key){
        Object ret = null;
        try{
            Class clazz = Class.forName(env.getProperty(key));
            ret = clazz.newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return ret;
    }
}
