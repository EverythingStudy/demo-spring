package spring.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import spring.bean.User;

import java.io.IOException;
import java.io.Reader;

/**
 * @ProjectName: demo-spring
 * @Package: spring.test
 * @ClassName: XmlMybatisTest
 * @Description
 * @Date 2020/10/23 13:20
 * @Author cly
 **/
public class XmlMybatisTest {

    public static void test2() throws IOException {
        //加载mybatis的配置文件（它也加载关联的映射文件）
        String resource = "conf.xml";
        //加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        //映射sql的标识字符串,是在影射文件中找到namespace+“”+select中的id
        String statement = "com.atguigu.day03_mybaits.userMapper.getUser";
        //执行查询返回一个唯一user对象的sql
        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }

    public static void main(String[] args) {
        try {
            test2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
