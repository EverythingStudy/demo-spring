package spring.entity;

import java.io.Serializable;

/**
 * (Swaggerperson)实体类
 *
 * @author makejava
 * @since 2020-04-03 18:49:54
 */
public class Swaggerperson implements Serializable {
    private static final long serialVersionUID = -12943800967582715L;
    
    private Integer id;
    
    private String name;
    
    private String phoneNum;


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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}