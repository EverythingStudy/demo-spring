package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Date 2020/2/27 12:34
 * @Author cly
 **/
@Controller
public class ServletContextController {
    @RequestMapping(value = "getServletContext")
    public void getServletContext(HttpServletRequest req){
        String test= (String) req.getSession().getServletContext().getAttribute("test");
        System.out.println(test);
    }
}
