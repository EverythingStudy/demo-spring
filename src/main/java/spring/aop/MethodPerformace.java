package spring.aop;

/**
 * @Description
 * @Date 2020/3/25 11:09
 * @Author cly
 **/
public class MethodPerformace {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformace(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.end = System.currentTimeMillis();
        System.out.println(serviceMethod + "运行花费" + (end - begin) + "时间");
    }
}
