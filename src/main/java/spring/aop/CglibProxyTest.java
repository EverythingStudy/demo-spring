package spring.aop;

import org.junit.Test;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @Description Cglib测试
 * @Date 2020/3/25 11:36
 * @Author cly
 **/
public class CglibProxyTest {
    @Test
    public void test(){
        System.out.println();
        CglibProxy cglibProxy=new CglibProxy();
        TargetInterface targetInterface=(TargetInterface)cglibProxy.getProxy(TargetInterfaceImpl.class);
        targetInterface.removeTopic(10);
    }
}
