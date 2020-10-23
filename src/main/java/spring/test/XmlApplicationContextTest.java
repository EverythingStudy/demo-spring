package spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.sql.DataSource;
import java.util.Set;


/**
 * @Description 手动获取xml， ClassPathXmlApplicationContext方式装载bean
 * @Date 2020/2/27 9:43
 * @Author cly
 **/
public class XmlApplicationContextTest {
    @Test
    public void xmlContext(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("swaggerpersonController");
        //System.out.println(BasicDataSource.getUrl());
    }

    @Test
    public void classPathScanTest(){
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
        Set<BeanDefinition> beanDefinitions = provider.findCandidateComponents("spring.controller");
        for(BeanDefinition beanDefinition : beanDefinitions) {
            System.out.println(beanDefinition.getBeanClassName()
                    + "\t" + beanDefinition.getResourceDescription()
                    + "\t" + beanDefinition.getClass());
        }
    }
}
