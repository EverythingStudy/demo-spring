package spring.aop.springAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ProjectName: demo-spring
 * @Package: spring.aop.springAop
 * @ClassName: MyAspect
 * @Description//todo Spring aop只能增强方法。
 * @Date 2020/11/11 18:28
 * @Author cly
 **/
@Component
@Aspect
public class MyAspect {
    //定义切点
    @Pointcut("execution(* spring.aop.springAop.*(..))")
    public void pointCutOne(){}
    //自定义注解，实现标记连接点。需要aop增强的方法处标记自定义注解
    @Pointcut("@annotation(spring.aop.springAop.SelfdifinedAnnotation)")
    public void pointCutTwo(){}
    /**     * 前置通知：目标方法执行之前执行以下方法体的内容      * @param jp     */
    @Before("pointCutOne()")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }


    /**     * 返回通知：目标方法正常执行完毕时执行以下代码     * @param jp     * @param result     */
    @AfterReturning(value="pointCutOne()",returning="result")
    public void afterReturningMethod(JoinPoint jp, Object result){
        String methodName = jp.getSignature().getName();
        System.out.println("【返回通知】the method 【" + methodName + "】 ends with 【" + result + "】");
    }


    /**     * 后置通知：目标方法执行之后执行以下方法体的内容，不管是否发生异常。     * @param jp     */
    @After("pointCutOne()")
    public void afterMethod(JoinPoint jp){
        System.out.println("【后置通知】this is a afterMethod advice...");
    }


    /**     * 异常通知：目标方法发生异常的时候执行以下代码     */
    @AfterThrowing(value="pointCutOne()",throwing="e")
    public void afterThorwingMethod(JoinPoint jp, NullPointerException e){
        String methodName = jp.getSignature().getName();
        System.out.println("【异常通知】the method 【" + methodName + "】 occurs exception: " + e);


    }
}
