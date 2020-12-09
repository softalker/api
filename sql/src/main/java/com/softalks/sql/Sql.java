package com.softalks.sql;

import java.sql.ResultSet;
import java.util.function.Consumer;

public interface Sql {

	void listen(Consumer<String> listener);
	
	interface Values {
		int values(Object ... values);
	}
	
	interface Insert {
		default Values with(String fields) {
			return fields(fields.split(","));
		}
		Values fields(String ... fields);
	}
	
	interface Cursor {
		void accept(ResultSet rs) throws Exception;
	}

	interface Result<T> {
		T apply(ResultSet rs) throws Exception;
	}

	void commit();

	Insert insertInto(String tabla);
	
	<T> T get(String statement, Object parameters, Result<T> result);

	int id(String table, String fields, Object ... values);

	int id(String table, String[] fields, Object ... values);

}