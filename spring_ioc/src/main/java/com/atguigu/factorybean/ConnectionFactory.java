package com.atguigu.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class ConnectionFactory {

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

    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(driverClass);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book?serverTimezone=GMT%2B8&rewriteBatchedStatements=true",
                    "root", "qianwei1234");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
