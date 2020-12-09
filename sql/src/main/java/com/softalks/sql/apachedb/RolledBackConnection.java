package com.softalks.sql.apachedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RolledBackConnection implements AutoCloseable {

	public final Connection connection;
	
	public RolledBackConnection(String url) {
		try {
			connection = DriverManager.getConnection(url);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	@Override
	public void close() {
		try {
			connection.rollback();
			connection.close();
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}