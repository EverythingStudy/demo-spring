package spring.controller;

import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Description
 * @Date 2020/2/27 12:34
 * @Author cly
 **/
@Controller
public class ServletContextController {
    @RequestMapping(value = "getServletContext",method = RequestMethod.GET,consumes = "application/json",produces ="application/json" )
    public void getServletContext(HttpServletRequest req){
        String test= (String) req.getSession().getServletContext().getAttribute("test");
        System.out.println(test);
    }

}
