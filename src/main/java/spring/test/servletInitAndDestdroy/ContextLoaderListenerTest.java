package spring.test.servletInitAndDestdroy;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description //TODO ContextLoaderListenerTest实现servletContextListener接口对ServletContext容器监听
 *              //TODO 1。web应用初始化时ServletContext创建完成，同时设置属性，spring也同样利用监听器监听web应用容器，初始化时将webApplicationContext放入ServletContext中
 *              //TODO 2.只要监听了servletContext在web应用销毁时或者停止Tomcat时，自动执行contextDestroyed(ServletContextEvent sce)
 * @Date 2020/2/27 12:10
 * @Author cly
 **/
public class ContextLoaderListenerTest implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //ServletContext容器初始是设置参数test，同理spring在启动是同样设置ServletContext
        sce.getServletContext().setAttribute("test","容器初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
        sce.getServletContext().removeAttribute("test");
    }
}
