package com.atguigu.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-10
 */
public class UserDAOTest {
    @Test
    public void test1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        UserDAO userDAO = session.getMapper(UserDAO.class);

        User user = new User();
        user.setUsername("admin12345");
        user.setPassword("admin123456");
        user.setEmail("admin123456@qq.com");

        userDAO.save(user);

        session.commit();
    }
}