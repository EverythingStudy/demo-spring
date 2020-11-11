package spring.aop.springAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ProjectName: demo-spring
 * @Package: spring.aop.springAop
 * @ClassName: TestController
 * @Description
 * @Date 2020/11/11 18:35
 * @Author cly
 **/
@Controller
public class TestController {
    @Autowired
    AopTestInterface aopTestInterface;
    @RequestMapping(value = "/aop/get",method = RequestMethod.GET)
    public void get(){
        aopTestInterface.aopTest();
    }
}
