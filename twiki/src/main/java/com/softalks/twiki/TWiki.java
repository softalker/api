package com.softalks.twiki;

import java.util.List;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softalks.twiki.TWikiFormPluginAction.Form;

public interface TWiki { 
			
	interface Service {
		void run() throws Exception;
	}
	
	CreateTopic createTopic(String documentName);

	ShowTopic showTopic(String name);
	
	void notify(Throwable thrown, HttpServletRequest request, HttpServletResponse response);

	void service(HttpServletRequest request, HttpServletResponse response, Service service);

	void form(HttpServletRequest request, HttpServletResponse response, List<String> nullable, Consumer<Form> processor);

	HttpServletResponse getResponse();

	HttpServletRequest getRequest();

}