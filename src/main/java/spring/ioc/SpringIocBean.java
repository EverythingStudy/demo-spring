package spring.ioc;

import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2020/3/20 12:03
 * @Author cly
 **/
@SpringIocServer
public class SpringIocBean {
    public String name;

    public String getName() {
        return "陈林亚";
    }

    public void setName(String name) {
        this.name = name;
    }
}
