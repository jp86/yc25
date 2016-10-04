package com.yc.ums.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.logging.log4j.LogManager;

/**
 * 乱码处理的过滤器
 * @author Administrator
 */
@WebFilter("/*")
public class CharacterEncodingFilter extends AbstractFilter{
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LogManager.getLogger().debug("使用字符编码集过滤器， 解决乱码问题....");
	}
  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//请求字符编码集
		request.setCharacterEncoding("utf-8");
		
		//响应字符编码集
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		chain.doFilter(request, response);
	}

}
