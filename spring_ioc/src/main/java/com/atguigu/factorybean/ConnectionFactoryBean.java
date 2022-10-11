package com.atguigu.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class ConnectionFactoryBean implements FactoryBean<Connection> {
    private String driverClass;
    private String url;
    private String username;
    private String password;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //用于书写创建复杂对象的代码
    @Override
    public Connection getObject() throws Exception {
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, username,password);

        return conn;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
