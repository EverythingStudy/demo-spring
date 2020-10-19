package spring.test.refreshBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description spring初始化bean的过程中在refresh()时先消除bean再创建bean
 * @Date 2020/2/28 10:30
 * @Author cly
 **/
public class DestroySingletons {
    public void bean(){
        Map<String,Object> map=new ConcurrentHashMap<>();
        map.clear();
    }
}
