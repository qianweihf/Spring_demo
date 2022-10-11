package com.atguigu.jdk;

import com.atguigu.proxy.User;
import com.atguigu.proxy.UserService;
import com.atguigu.proxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-08
 */
public class TestJDKProxy {
    /*
    1.借用的类加载器，可以使用任意类   TestJDKProxy   UserServiceImpl
    2. JDK8.x前，内部类使用外部类的局部变量，需要声明为final
        final UserService userService = new UserServiceImpl();
     */
    public static void main(String[] args) {
        //1. 创建原始对象
        UserService userService = new UserServiceImpl();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---proxy log---");
                //原始方法运行
                Object ret = method.invoke(userService, args);
                return ret;
            }
        };

        //2. JDK创建动态代理
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(TestJDKProxy.class.getClassLoader(),userService.getClass().getInterfaces(),handler);
        userServiceProxy.login("admin","admin");
        userServiceProxy.register(new User());
    }
}
