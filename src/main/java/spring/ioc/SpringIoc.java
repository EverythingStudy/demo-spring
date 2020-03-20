package spring.ioc;

import org.junit.Test;

/**
 * @Description Spring IOC测试
 * @Date 2020/3/20 15:28
 * @Author cly
 **/
public class SpringIoc {
    @Test
    public void test() {
        SpringIocContext app = new SpringIocContext("spring.ioc.SpringIocServiceTest,spring.ioc.SpringIocBean");
        SpringIocServiceTest springIocServiceTest= (SpringIocServiceTest) app.getBean("springIocServiceTest");
        springIocServiceTest.get();
    }

}
