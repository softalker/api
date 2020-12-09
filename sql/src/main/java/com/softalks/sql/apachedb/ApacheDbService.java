package com.softalks.sql.apachedb;

import java.util.Iterator;
import java.util.ServiceLoader;

public interface ApacheDbService {
	
	ApacheDb apacheDb = get();
	
	public static ApacheDb get() {
		ServiceLoader<ApacheDb> loader = ServiceLoader.load(ApacheDb.class);
		Iterator<ApacheDb> iterator = loader.iterator();
		while (iterator.hasNext()) {
			return iterator.next();
		}
		return null;
	}
	
}