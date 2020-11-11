package spring.aop;


import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description Cglib增强字节码代理 创建一个方法拦截器实现methodInterceptor
 * @Date 2020/3/25 11:31
 * @Author cly
 **/
public class CglibProxy implements MethodInterceptor {
    //JDK的动态代理使用的是Proxy代理类，Cglib使用的是差不多的类--Enhancer实现动态代理。
   private Enhancer enhancer=new Enhancer();
   public Object getProxy(Class clazz){
       //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\");
       //需要增强的类
       enhancer.setSuperclass(clazz);
       //回调
       enhancer.setCallback(this);
       //创建代理类
       return enhancer.create();
   }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("===");
       Object obj=methodProxy.invokeSuper(o,objects);
        return obj;
    }
}
