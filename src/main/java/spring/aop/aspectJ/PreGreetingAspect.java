package spring.aop.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @Description @Aspect定义切面类=切点配置+增强代码
 * @Date 2020/3/25 11:56
 * @Author cly
 **/
@Aspect
public class PreGreetingAspect {
    @Before(value = "execution(* greetTo(..))")
    public void beforeGreeting(){
        System.out.println("hello word");
    }
    @DeclareParents(value = "spring.aop.aspectJ.NativeWaiter",defaultImpl = SellerImpl.class)
    public Seller seller;
}
