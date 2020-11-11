/**
 * 
 */
package spring.aop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenly
 * 
 */
public interface AbstractInterceptor {

	boolean check(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
