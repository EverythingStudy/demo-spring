package spring.ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description springIOC容器类
 * @Date 2020/3/20 12:17
 * @Author cly
 **/
public class SpringIocContext {
    private String packages;
    //存放bean的实例
    private Map<String, Object> beans = null;

    SpringIocContext(String packages) {
        beans = new ConcurrentHashMap<>();
        this.packages = packages;
        //实例化bean，默认beanid为首字母小写的类名
        initBean();
        //依赖注入属性
        initBeanFields();
    }

    public Object getBean(String beanName) {
        return beans.get(beanName);
    }

    public void initBean() {
        //模拟扫描包--这里需要后期实现真正的扫描。
        String[] Strings = StringUtils.tokenizeToStringArray(packages,
                ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS);
        List<String> listClassName = Arrays.asList(Strings);
        for (String name : listClassName) {
            try {
                Class classBean = Class.forName(name);
                //检查是否有注解
                SpringIocServer springIocServer = (SpringIocServer) classBean.getAnnotation(SpringIocServer.class);
                if (springIocServer == null) {
                    new Exception();
                }
                beans.put(toLowerCaseFirstOne(classBean.getSimpleName()), classBean.newInstance());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

    }

    public void initBeanFields() {
        try {
            for (Map.Entry<String, Object> map : beans.entrySet()) {
                Object object = map.getValue();
                Class classBean = object.getClass();
                //检查属性是否有注解
                Field[] fields = classBean.getDeclaredFields();
                for (Field field : fields) {
                    SpringIocAutowired springIocAutowired = (SpringIocAutowired) field.getAnnotation(SpringIocAutowired.class);
                    if (springIocAutowired != null) {
                        field.setAccessible(true);
                        System.out.println(beans.get(field.getName()));
                        field.set(object, beans.get(field.getName()));
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // 首字母转小写
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }
}
