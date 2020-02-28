package spring.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 *Tomcat容器属于web容器的一种，web容器还包括weblogic容器、JBoss容器等；而Tcomcat、webLogic等包含servlet容器。
 *
 * web容器：可以部署多个WEB应用程序的环境。
 *
 * Tomcat容器：是Java Servlet，JavaServer Pages，Java Expression Language和Java WebSocket（Java EE）技术的开源实现。
 *
 * Servlet容器：全称server applet，意为服务程序。主要作用是给上级容器(Tomcat)提供doGet()和doPost()等方法。其生命周期实例化、初始化、调用、销毁受控于Tomcat容器。
 *
 *
 * @Description ServletContext 学习Servlet技术，就需要有一个Servlet运行环境，也就是需要有一个Servlet容器，用的是Tomcat。
 * servlet上下文，又名application，对于web项目来说，全局唯一的一个servletContext对象。
 * 用途：
 *  1.获取全局配置文件的参数
 *  2.获取web项目的绝对路径
 *  3.用于获取WebRoot文件夹下的文件(.JSP,.PNG,.html,.doc,)资源
 * @Date 2020/2/27 7:37
 * @Author cly
 **/
public class LearnServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        //获取到servletContext对象1   (从当前Servlet对象获得)
        ServletContext c1=this.getServletContext();

        //获取到servletContext对象2  (从ServletConfig对象获得)
        ServletContext c2=this.getServletConfig().getServletContext();

        //获取到servletContext对象3   (从会话对象获取到，这是常用的方式)
        ServletContext c3=req.getSession().getServletContext();

        //判断对象是不是全局唯一
        System.out.println(c1==c2);
        System.out.println("对象标识："+c1.hashCode()+"---"+c2.hashCode()+"---"+c3.hashCode());
       //1.获取全局配置文件的参数
        String location=c1.getInitParameter("contextConfigLocation");
        //2.获取资源
        // 用于获取WebRoot文件夹下的文件(.JSP,.PNG,.html,.doc,)资源
        //获取src下的文件资源
        //不能获取到InputStream inputStream=req.getSession().getServletContext().getResourceAsStream("springMVC-context.xml");
       // System.out.println(inputStream.available());
        InputStream inputStream1=this.getClass().getClassLoader().getResourceAsStream("springMVC-context.xml");
        System.out.println(inputStream1.available());
        //*3.获取web项目的绝对路径
        System.out.println("web项目绝对路径："+c2.getRealPath(""));
        System.out.println("web项目绝对路径："+c2.getRealPath("/"));
        System.out.println("web项目绝对路径："+c2.getRealPath("/upload"));
    }
}
