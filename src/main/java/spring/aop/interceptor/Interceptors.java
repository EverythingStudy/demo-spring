package spring.aop.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author cly
 * @Description //TODO 拦截器
 * @Date 17:55 2020/3/24
 * @Param 
 * @return 
 **/
public class Interceptors implements HandlerInterceptor{
	private List<AbstractInterceptor> interceptorList;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		for (AbstractInterceptor abstractInterceptor : interceptorList) {
			if (!abstractInterceptor.check(request, response)) {
				return false;
			}
		}
		return true;

	}

	public List<AbstractInterceptor> getInterceptorList() {
		return interceptorList;
	}

	public void setInterceptorList(List<AbstractInterceptor> interceptorList) {
		this.interceptorList = interceptorList;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("===========HandlerInterceptor1 postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		System.out.println("===========HandlerInterceptor1 afterCompletion");
	}
}
