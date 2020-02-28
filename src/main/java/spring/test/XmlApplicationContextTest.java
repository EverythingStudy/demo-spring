package spring.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.sql.DataSource;


/**
 * @Description 手动获取xml 装载bean
 * @Date 2020/2/27 9:43
 * @Author cly
 **/
public class XmlApplicationContextTest {
    @Test
    public void xmlContext(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BasicDataSource BasicDataSource= (BasicDataSource) classPathXmlApplicationContext.getBean("dataSource");
        System.out.println(BasicDataSource.getUrl());
    }
}
