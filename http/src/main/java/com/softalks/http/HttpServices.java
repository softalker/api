package com.softalks.http;

import static java.util.ServiceLoader.load;

import java.util.Iterator;
import java.util.ServiceLoader;

public class HttpServices {

	public static final HttpFactory http = get(HttpFactory.class);

	public static final FilterFactory filterFactory = get(FilterFactory.class);
	
	public static <T> T get(Class<T> service) {
		ServiceLoader<T> loader = load(service);
		Iterator<T> iterator = loader.iterator();
		while (iterator.hasNext()) {
			return iterator.next();
		}
		return null;
	}
	
}
