package spring.aop.springAop;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo-spring
 * @Package: spring.aop.springAop
 * @ClassName: AopTestInterfaceImpl
 * @Description
 * @Date 2020/11/11 18:26
 * @Author cly
 **/
@Service
public class AopTestInterfaceImpl implements AopTestInterface {
    @Override
    public void aopTest() {
        System.out.println("spring aop目标类");
    }
}
