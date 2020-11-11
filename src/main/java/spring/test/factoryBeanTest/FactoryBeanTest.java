package spring.test.factoryBeanTest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo-spring
 * @Package: spring.test.factoryBeanTest
 * @ClassName: FactoryBeanTest
 * @Description
 * @Date 2020/11/11 14:23
 * @Author cly
 **/
@Component
public class FactoryBeanTest implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new FactoryBeanTest();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
