package spring.bean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @Description
 * @Date 2020/3/30 13:16
 * @Author cly
 **/
@Configuration
public class ConfigureInfo {
    @Test
    public void configure(){
        AnnotationConfigWebApplicationContext annotationConfigApplicationContext=new AnnotationConfigWebApplicationContext();
        annotationConfigApplicationContext.register(ConfigureInfo.class);
        annotationConfigApplicationContext.register(ConfigureBean.class);
        annotationConfigApplicationContext.refresh();
        annotationConfigApplicationContext.getBean(ConfigureBean.class);
        annotationConfigApplicationContext.close();
    }
}
