package spring.test.postProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo-spring
 * @Package: spring.test.postProcessors
 * @ClassName: BeanPostProcessorTest
 * @Description todo 测试实现BeanPostProcessor后置处理器，spring加载的bean初始化之前都会调用。可以通过beanName和bean来处理选择需要处理的对象。
 * todo 发生在实例化和依赖注入之后
 * @Date 2020/11/6 17:09
 * @Author cly
 **/
@Service
@Order(3)
public class BeanPostProcessorTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessorTest--Before--"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessorTest--After--"+beanName);
        return bean;
    }
}
