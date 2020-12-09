package com.softalks.http;

public interface OutgoingHttpLog extends Log { 
	void setUrl(String url);
	void setMetadata(String string);
}