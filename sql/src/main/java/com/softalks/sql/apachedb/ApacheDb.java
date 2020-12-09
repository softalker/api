package com.softalks.sql.apachedb;

import java.util.List;

public interface ApacheDb {
	
	Object getContextListener(String database, String name, List<String> dataDefinitionStatements);
	
}