package spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.bean.ConfigureBean;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2020/2/28 18:05
 * @Author cly
 **/
public class TestList {
  private List<Map<String,Object>> list;

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

}
