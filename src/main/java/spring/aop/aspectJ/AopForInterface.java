package spring.aop.aspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Description
 * @Date 2020/3/25 13:35
 * @Author cly
 **/
public class AopForInterface implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
