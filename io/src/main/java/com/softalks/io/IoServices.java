package com.softalks.io;

import static java.util.ServiceLoader.load;

import java.util.Iterator;
import java.util.ServiceLoader;

public class IoServices {

	public static final Streams streams = get(Streams.class);
	
	public static <T> T get(Class<T> service) {
		ServiceLoader<T> loader = load(service);
		Iterator<T> iterator = loader.iterator();
		while (iterator.hasNext()) {
			return iterator.next();
		}
		return null;
	}
	
}
