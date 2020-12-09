package com.softalks.twiki;

import static com.softalks.twiki.TWikiServices.tWiki;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softalks.http.Servlet;

public abstract class TWikiFormPluginAction extends Servlet {

    private static final long serialVersionUID = 1L;
    
    protected List<String> nullable = new ArrayList<>();
	
	public interface Form {
		String get(String parameter);
	}
	
	@Override
	protected final void get(HttpServletRequest request, HttpServletResponse response) throws Exception {
		tWiki.form(request, response, nullable, fields -> {
			try {
				process(fields);
			} catch (RuntimeException e) {
				throw e;
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		});
	}

	protected abstract void process(Form fields) throws Exception;
	
}
