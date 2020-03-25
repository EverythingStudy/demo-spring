package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description JDK动态代理了
 * @Date 2020/3/25 11:01
 * @Author cly
 **/
public class ProxyTarget implements InvocationHandler {
    Object object;

    public void setObject(Object object) {
        this.object = object;
    }
    public Object getObject() {
        return object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor performanceMonitor=new PerformanceMonitor();
        performanceMonitor.begin("spring.aop");
        Object obj=method.invoke(object,args);
        performanceMonitor.end();

        return obj;
    }
}
