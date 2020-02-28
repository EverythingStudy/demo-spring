package spring.test.servletInitAndDestdroy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description 可以用servlet来访问
 * @Date 2020/2/27 12:29
 * @Author cly
 **/
public class ServletContextTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String test= (String) req.getSession().getServletContext().getAttribute("test");
        System.out.println(test);
    }
}
