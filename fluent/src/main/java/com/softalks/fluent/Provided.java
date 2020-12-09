package com.softalks.fluent;

public interface Provided {
	
	Object[] values(String provider);

	Object value(String provider);
	
	<T> T cast(String provider);

	boolean signal(String provider);

}
