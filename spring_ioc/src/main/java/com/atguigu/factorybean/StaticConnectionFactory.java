package com.atguigu.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class StaticConnectionFactory {
    //静态工厂不是指类为静态，而是方法为静态
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
