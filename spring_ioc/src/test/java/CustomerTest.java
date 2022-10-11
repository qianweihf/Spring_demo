import com.atguigu.constructor.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-09-25
 */
public class CustomerTest {
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = ctx.getBean("customer", Customer.class);
        System.out.println("customer = " + customer);
    }


}