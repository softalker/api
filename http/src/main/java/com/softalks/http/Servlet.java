package com.softalks.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

    @Override
	protected final void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String method = req.getMethod().toLowerCase();
			if (method.equalsIgnoreCase("post")) {
				post(req, resp);
			} else if (method.equalsIgnoreCase("get")) {
				get(req, resp);
			} else {
				throw new IllegalArgumentException(method);
			}
		} catch (IOException | ServletException | RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	protected void get(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
	}
	
	protected void post(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
	}
	
}