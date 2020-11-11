package spring.test.beanAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo-spring
 * @Package: spring.test.beanAware
 * @ClassName: BeanAwareTest
 * @Description
 * @Date 2020/11/11 13:44
 * @Author cly
 **/
@Service
public class BeanAwareTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBean("beanPostProcessorTest"));
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName=="+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getApplicationName());
    }
}
