package spring.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo-spring
 * @Package: spring.dao
 * @ClassName: Svm
 * @Description //todo 测试实现BeanPostProcessor后置处理器，spring加载的bean初始化之前都会调用。
 * @Date 2020/10/19 16:47
 * @Author cly
 **/
@Service
@Order(1)
public class Svm implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getName()+"1初始化前调用");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getName()+"1初始化后调用");
        return bean;
    }
}
