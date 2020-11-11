package spring.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo-spring
 * @Package: spring.dao
 * @ClassName: SvmTest
 * @Description
 * @Date 2020/10/19 16:55
 * @Author cly
 **/
@Service
@Order(2)
public class SvmTest implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getName()+"2初始化前调用");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getName()+"2初始化后调用");
        return bean;
    }
}
