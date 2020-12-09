package com.softalks.http;

import java.io.InputStream;
import java.util.Map;

public interface Log {
	void setQueryString(String queryString);
	void setMethod(String method);
	void setRequestHeader(String key, String value);
	void setRequestBody(InputStream requestBody);
	void setResponseCode(int responseCode);
	void setResponseMessage(String responseMessage);
	void setResponseHeaders(Map<String, String> responseHeaders);
	void setResponseBody(InputStream responseBody);
}
