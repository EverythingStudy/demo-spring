package spring.aop.aspectJ;

/**
 * @Description
 * @Date 2020/3/25 13:45
 * @Author cly
 **/
public class SellerImpl implements Seller {
    @Override
    public void sell(String...name) {
        System.out.println(name[0]);
    }
}
