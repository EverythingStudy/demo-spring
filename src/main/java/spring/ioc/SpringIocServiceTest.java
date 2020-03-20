package spring.ioc;

/**
 * @Description 模拟依赖注入实体
 * @Date 2020/3/20 12:09
 * @Author cly
 **/
@SpringIocServer
public class SpringIocServiceTest {
    @SpringIocAutowired(true)
    private SpringIocBean springIocBean;
    public void get(){
        System.out.println(springIocBean.getName());
    }
}
