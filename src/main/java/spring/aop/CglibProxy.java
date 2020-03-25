package spring.aop;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description Cglib增强字节码代理
 * @Date 2020/3/25 11:31
 * @Author cly
 **/
public class CglibProxy implements MethodInterceptor {
   private Enhancer enhancer=new Enhancer();
   public Object getProxy(Class clazz){
       enhancer.setSuperclass(clazz);
       enhancer.setCallback(this);
       return enhancer.create();
   }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("===");
       Object obj=methodProxy.invokeSuper(o,objects);
        return obj;
    }
}
