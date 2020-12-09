package com.softalks.xml;

import com.softalks.fluent.Terminal;

public interface Xml {

	interface Search {
		Tag hasA(String string);
	}
	
	interface Match {
		@Terminal
		boolean beforeEndOf(String string);
	}
	
	interface Tag extends Match {
		Match containing(String text);
	}
	
	Search in(byte[] bytes);

}
