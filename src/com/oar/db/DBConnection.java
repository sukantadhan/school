package com.oar.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection connection = null;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott", "scott", "tiger");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
