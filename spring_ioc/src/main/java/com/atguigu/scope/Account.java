package com.atguigu.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-26
 */
public class Account implements InitializingBean, DisposableBean {
//public class Account{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Account.setName");
        this.name = name;
    }

    public Account() {
        System.out.println("Account.Account");
    }

    public void myInit(){
        System.out.println("Account.myInit");
    }

    //这个就是初始化方法：做一些初始化操作
    //Spring会进行调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Account.afterPropertiesSet");
    }

    //销毁方法：销毁操作（资源的释放操作）
    @Override
    public void destroy() throws Exception {
        System.out.println("Account.destroy");

    }

    public void myDestroy() throws Exception{
        System.out.println("Account.myDestroy");
    }
}
