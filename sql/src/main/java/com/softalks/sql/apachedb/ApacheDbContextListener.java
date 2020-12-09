package com.softalks.sql.apachedb;

import static com.softalks.sql.apachedb.ApacheDbService.apacheDb;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public abstract class ApacheDbContextListener implements ServletContextListener {

	private final ServletContextListener delegate;
	
	protected ApacheDbContextListener(String database, String table) {
		Object delegate = apacheDb.getContextListener(database, table, getDataDefinitionStatements());
		this.delegate = (ServletContextListener) delegate;
	}
		
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		delegate.contextInitialized(sce);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		delegate.contextDestroyed(sce);
	}

	public List<String> getDataDefinitionStatements() {
		return null;
	};
	
}