import com.atguigu.basic.User;
import com.atguigu.basic.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-16
 */
public class UserTest {

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login("admin","admin");
        userService.register(new User("admin123","admin123"));
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user);
        String[] emails = user.getEmails();
        for (String email : emails) {
            System.out.println(email);
        }

        for (String tel : user.getTels()) {
            System.out.println("tel = " + tel);
        }
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = context.getBean("user", User.class);
        user.setUsername("admin");
        user.setPassword("123456");

        System.out.println(user);
    }

    @Test
    public void testUser(){
        //1.获得Spring的工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //2.通过工厂类获得对象
        User user = (User) context.getBean("user");

        //通过这种方式获得对象，就不需要强制类型转换
        //User user = context.getBean("user", User.class);

        //当前Spring的配置文件中 只能有一个<bean class是User类型，否则会报异常
        //User user = context.getBean(User.class);

        //获取的是Spring工厂配置文件中所有Bean标签的id值 user
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

        //根据类型获得Spring配置文件中对应的id值
        String[] beanNamesForType = context.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println("id = " + s);
        }

        //用于判断是否存在指定id值的Bean
        boolean isExistsUser = context.containsBeanDefinition("user");
        System.out.println(isExistsUser);

        //用于判断是否存在指定id值的bean
        if (context.containsBean("user")) {
            System.out.println("true = " + true);
        }else{
            System.out.println("false = " + false);
        }

    }
}
