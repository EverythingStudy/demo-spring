package spring.aop.aspectJ;

/**
 * @Description AOP增强目标类target
 * @Date 2020/3/25 12:07
 * @Author cly
 **/
public class NativeWaiter implements Waiter {
    @Override
    public void greetTo(String clientName) {
        System.out.println("NativeWarter:greet to:"+clientName+"--");
    }

    @Override
    public void serverTo(String clientName) {
        System.out.println("NativeWarter:serving to:"+clientName+"--");
    }
}
