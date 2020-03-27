/**
 * 
 */
package spring.aop.interceptor;

import org.springframework.beans.factory.annotation.Autowired;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenly
 * 
 */
public class AuthInterceptor implements AbstractInterceptor {
	private boolean API_ISOPNE;// 是否开放接口
	private String API_IDENTIFIER;// 开放机构编号
	private String KEY;// 验证私钥
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adapter.interceptor.AbstractInterceptor#check(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public boolean check(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("进入拦截器");
		String token = request.getParameter("sign");
		String identifier = request.getParameter("identifier");
		String timestamp = request.getParameter("timestamp");
		String url = request.getRequestURI();
		Enumeration em = request.getParameterNames();
		Map<String, Object> map = new HashMap<String, Object>();
		while (em.hasMoreElements()) {
			String name = (String) em.nextElement();
			String value = request.getParameter(name);
			map.put(name, value);
		}

		if("".equals(identifier)){
			//ResponseHelper.doReturn(ResponseHelper.getRsult(100, "尚未开通此接口"), response);
			return false;
		}
//		if (!timeVerify(timestamp)) {
//			ResponseHelper.doReturn(ResponseHelper.getRsult(105, "请求接口时间超时"), response);
//		}
//		if (!isOpen(identifier, url)) {
//			ResponseHelper.doReturn(ResponseHelper.getRsult(100, "尚未开通此接口"), response);
//			return false;
//		}
//		if (!tokenVerify(map, token)) {
//			ResponseHelper.doReturn(ResponseHelper.getRsult(102, "接口token验证错误"), response);
//			return false;
//		}
		return true;
	}
}
