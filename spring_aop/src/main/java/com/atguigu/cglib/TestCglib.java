package com.atguigu.cglib;

import com.atguigu.proxy.User;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-08
 */
public class TestCglib {
    public static void main(String[] args) {
        //1. 创建原始对象
        UserService userService = new UserService();

        /*
        2. 通过Cglib方式创建动态代理对象
        Proxy.newProxyInstance(classloader,interface,invocationhandler)
        Enhance.setClassLoader()
        Enhance.setSuperClass()
        Enhance.setCallback()   ---> MethodInterceptor  Cglib包中
        Enhancer.create()   ---> 代理
         */
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(TestCglib.class.getClassLoader());
        enhancer.setSuperclass(userService.getClass());
        MethodInterceptor interceptor = new MethodInterceptor() {
            //等同于InvocationHandler  ---> invoke
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("---cglib log---");
                Object ret = method.invoke(userService, objects);
                return ret;
            }
        };

        enhancer.setCallback(interceptor);

        UserService userServiceProxy = (UserService) enhancer.create();
        userServiceProxy.login("admin","admin");
        userServiceProxy.register(new User());
    }
}
