package spring.aop.aspectJ;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @Description AOP测试入口
 * @Date 2020/3/25 12:13
 * @Author cly
 **/
public class AopTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Waiter waiter=(Waiter)applicationContext.getBean("nativeWarter");
        waiter.greetTo("how are you");

        Seller seller=(Seller) waiter;
        seller.sell("john","beer");
    }
}
