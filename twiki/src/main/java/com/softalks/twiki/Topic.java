package com.softalks.twiki;

import static com.softalks.twiki.TWikiServices.tWiki;

public interface Topic {
	
	default ShowTopic show() {
		return tWiki.showTopic(getName());
	}
	
	String getName();
	
}