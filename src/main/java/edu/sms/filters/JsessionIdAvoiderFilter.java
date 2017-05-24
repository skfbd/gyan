package edu.sms.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsessionIdAvoiderFilter
 */
public class JsessionIdAvoiderFilter implements Filter {
	public void doFilter1(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		boolean allowFilterChain = redirectToAvoidJsessionId((HttpServletRequest) req, (HttpServletResponse) res);
		// if its redirected, then no need to continue processing the request
		if (allowFilterChain) {
			chain.doFilter(req, res);
		}
	}

	public static boolean redirectToAvoidJsessionId(HttpServletRequest req, HttpServletResponse res) {
		String requestURI = req.getRequestURI();
		if (requestURI.indexOf(";JSESSIONID=") > 0) {
			try {
				res.sendRedirect("/");
				return false;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
