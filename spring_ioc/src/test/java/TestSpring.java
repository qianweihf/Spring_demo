import com.atguigu.basic.BeanFactory;
import com.atguigu.basic.User;
import com.atguigu.basic.UserService;

import org.junit.Test;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-18
 */
public class TestSpring {

    @Test
    public void test1(){
        //UserService userService = new UserServiceImpl();
        UserService userService = (UserService) BeanFactory.getBean("userService");

        userService.login("name","123456");

        User user = new User("suns","123456");
        userService.register(user);
    }
}
