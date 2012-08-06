package jp.co.bulletinboard.interceptor;

import javax.servlet.http.HttpSession;

import jp.co.bulletinboard.dto.UserDto;
import jp.co.bulletinboard.exception.AccessPermissionNotFoundException;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class AuthCheckInterceptor extends AbstractInterceptor {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public Object invoke(MethodInvocation arg0) throws Throwable {
		HttpSession session = (HttpSession) SingletonS2ContainerFactory
                .getContainer()
                .getExternalContext()
                .getSession();

		UserDto user = (UserDto) session.getAttribute("userDto");

		if (!"本社".equals(user.storeName)) {
			return "/error/access-error.jsp";
		}

		return arg0.proceed();
	}



}
