package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import spring.bean.Role;
import spring.bean.User;

/**
 * @ProjectName: demo-spring
 * @Package: spring.controller
 * @ClassName: ConstructorAutowired
 * @Description //TODO 测试构造方法注入
 * @Date 2020/10/22 10:54
 * @Author cly
 **/
@Component
public class ConstructorAutowired {
//    @Autowired(required = false)
//    ConstructorAutowired(User user){
//        System.out.println(user.getAge()+"--"+user.getName());
//    }
    @Autowired(required = false)
    ConstructorAutowired(User user, Role role){
        FileSystemResource fileSystemResource=new FileSystemResource("");
        ClassPathResource classPathResource=new ClassPathResource("");
        System.out.println(user.getAge()+"--"+user.getName());
        System.out.println(role.getId()+"--"+role.getName());
    }
}
