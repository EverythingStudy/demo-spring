package spring.aop;

/**
 * @Description
 * @Date 2020/3/25 11:08
 * @Author cly
 **/
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformace> methodPerformaceThreadLocal=new ThreadLocal<>();
    public void begin(String method){
        MethodPerformace methodPerformace=new MethodPerformace(method);
        methodPerformaceThreadLocal.set(methodPerformace);
    }
    public void end(){
        MethodPerformace methodPerformace=methodPerformaceThreadLocal.get();
        methodPerformace.printPerformance();
    }
}
