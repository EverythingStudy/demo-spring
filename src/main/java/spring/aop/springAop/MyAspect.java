package spring.aop.springAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ProjectName: demo-spring
 * @Package: spring.aop.springAop
 * @ClassName: MyAspect
 * @Description
 * @Date 2020/11/11 18:28
 * @Author cly
 **/
@Component
@Aspect
public class MyAspect {
    /**     * 前置通知：目标方法执行之前执行以下方法体的内容      * @param jp     */
    @Before("execution(* spring.aop.*.*(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }


    /**     * 返回通知：目标方法正常执行完毕时执行以下代码     * @param jp     * @param result     */
    @AfterReturning(value="execution(* spring.aop.*.*(..))",returning="result")
    public void afterReturningMethod(JoinPoint jp, Object result){
        String methodName = jp.getSignature().getName();
        System.out.println("【返回通知】the method 【" + methodName + "】 ends with 【" + result + "】");
    }


    /**     * 后置通知：目标方法执行之后执行以下方法体的内容，不管是否发生异常。     * @param jp     */
    @After("execution(* spring.aop.*.*(..))")
    public void afterMethod(JoinPoint jp){
        System.out.println("【后置通知】this is a afterMethod advice...");
    }


    /**     * 异常通知：目标方法发生异常的时候执行以下代码     */
    @AfterThrowing(value="execution(* spring.aop.*.*(..))",throwing="e")
    public void afterThorwingMethod(JoinPoint jp, NullPointerException e){
        String methodName = jp.getSignature().getName();
        System.out.println("【异常通知】the method 【" + methodName + "】 occurs exception: " + e);


    }
}
