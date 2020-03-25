package spring.aop;

/**
 * @Description
 * @Date 2020/3/25 11:00
 * @Author cly
 **/
public class TargetInterfaceImpl implements TargetInterface {
    @Override
    public void removeTopic(int topic) {
        System.out.println("removeTopic");
    }

    @Override
    public void removeForoum(int foroum) {
        System.out.println("foroum");
    }
}
