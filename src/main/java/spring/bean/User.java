package spring.bean;

/**
 * @ProjectName: demo-spring
 * @Package: spring.bean
 * @ClassName: User
 * @Description
 * @Date 2020/10/22 10:55
 * @Author cly
 **/
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
