package spring.aop;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Date 2020/3/25 11:17
 * @Author cly
 **/
public class ProxyTargetTest {
    @Test
    public void test(){
        TargetInterface targetInterface=new TargetInterfaceImpl();
        ProxyTarget proxyTarget=new ProxyTarget();
        proxyTarget.setObject(targetInterface);
        TargetInterface targetInterface1=(TargetInterface) Proxy.newProxyInstance(this.getClass().getClassLoader(),targetInterface.getClass().getInterfaces(),proxyTarget);
        targetInterface1.removeTopic(10);
    }
}
