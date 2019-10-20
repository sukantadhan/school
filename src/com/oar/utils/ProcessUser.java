package com.oar.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oar.db.DBConnection;

public class ProcessUser{
	
	public String getName(String username) throws SQLException {
		String name=null;
		Connection connection = DBConnection.getConnection();
		String query = "select name from STUDENTS where username = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, username);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			name = result.getString(1);
		}		
		return name;
	}
	
	public Integer getRoll(String username) throws SQLException {
		Integer roll=null;
		Connection connection = DBConnection.getConnection();
		String query = "select rollno from STUDENTS where username = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, username);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			roll = result.getInt(1);
		}		
		return roll;
	}
}