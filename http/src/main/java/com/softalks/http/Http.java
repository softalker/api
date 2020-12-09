package com.softalks.http;

import java.io.OutputStream;
import java.util.Map;
import java.util.function.Consumer;

public interface Http extends Runnable {

	@FunctionalInterface
	public interface RequestBodyWriter {
		void accept(OutputStream body) throws Exception;
	}

	@FunctionalInterface
	public interface ResponseBodyReader {
		void accept(byte[] body) throws Exception;
	}

	void setRequestHeader(String key, String value);

	int getResponseCode();

	String getErrorDescription();

	String getResponseMessage();

	Map<String, String> getResponseHeaders();

	void setMethod(String method);

	void setRequestBody(RequestBodyWriter writer);

	void getResponseBody(ResponseBodyReader reader);

	void setRequestForm(Consumer<Map<Object, Object>> consumer);

	Map<Object, Object> getQuery();

	default boolean isOk() {
		run();
		return getResponseCode() < 400;
	}

	void setRequestHeaders(Consumer<Map<String, String>> headers);

	String getResponseHeader(String string);

}