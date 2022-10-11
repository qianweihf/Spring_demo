package com.atguigu.constructor;

import java.io.Serializable;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class Customer implements Serializable {
    private String name;
    private int age;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
