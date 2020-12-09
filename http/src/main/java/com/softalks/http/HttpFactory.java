package com.softalks.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletResponse;

public interface HttpFactory {

	default void redirect(HttpServletResponse response, String url, Consumer<Map<Object, Object>> consumer) {
		Http http = get(url);
		http.setRequestForm(consumer);
		try {
			response.sendRedirect(http.toString());
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	default Http get(String url) {
		return service("GET", url);
	}

	default Http post(String url) {
		return service("POST", url);
	}

	Http service(String method, String url);

	default String decode(Object string) {
		try {
			return URLDecoder.decode(string.toString(), "utf-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException(e);
		}
	}
	
	default String encode(Object string) {
		try {
			return URLEncoder.encode(string.toString(), "utf-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException(e);
		}
	}
	
	
}