package com.softalks.http;

import static com.softalks.http.HttpServices.filterFactory;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HttpFilter implements javax.servlet.Filter {

	javax.servlet.Filter backend;
	
	@Override
	public void destroy() {
		backend.destroy();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		backend.doFilter(request, response, chain);	
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		backend = filterFactory.apply(filterConfig);
		backend.init(filterConfig);
	}

}