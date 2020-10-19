package spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description
 * @Date 2020/3/30 13:19
 * @Author cly
 **/
public class ConfigureBean {
    public  String name;
    public String age;

    @PostConstruct
    public void init(){
        System.out.println("=ConfigureBean=init");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
