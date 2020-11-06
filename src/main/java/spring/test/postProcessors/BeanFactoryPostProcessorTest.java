package spring.test.postProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @ProjectName: demo-spring
 * @Package: spring.test.postProcessors
 * @ClassName: BeanFactoryPostProcessor
 * @Description todo BeanFactoryPostProcessor：BeanFactory级别的处理，是针对整个Bean的工厂进行处理,调用时bean还没有被实例化，此时bean刚被解析成BeanDefiniton
 * @Date 2020/11/6 17:41
 * @Author cly
 **/
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition=beanFactory.getBeanDefinition("servletContextController");
        String name=beanDefinition.getBeanClassName();
        System.out.println(name);
    }
}
