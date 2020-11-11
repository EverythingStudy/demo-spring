package spring.bean;

import org.springframework.beans.factory.annotation.Required;

/**
 * @ProjectName: demo-spring
 * @Package: spring.bean
 * @ClassName: Role
 * @Description
 * @Date 2020/10/22 10:58
 * @Author cly
 **/
public class Role {
    private Integer id;
    private String name;
    @Required
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
