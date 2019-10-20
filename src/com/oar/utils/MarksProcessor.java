package com.oar.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.oar.db.DBConnection;

public class MarksProcessor {

	public StudentResult getMarks(String username) throws SQLException {

		String name = null;
		StudentResult studentResult = new StudentResult();

		Map<String, Integer> marks = new HashMap<>();
		ProcessUser processUser = new ProcessUser();
		Integer rollno = processUser.getRoll(username);
		Connection connection = DBConnection.getConnection();
		String query = "select rollno,subject,mark from MARK where rollno = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, rollno);
		ResultSet result = statement.executeQuery();
		Integer rollNum = null;

		while (result.next()) {
			rollNum = result.getInt(1);
			String subject = result.getString(2);
			String mark = result.getString(3);
			marks.put(subject, Integer.parseInt(mark));
		}

		studentResult.setRoll(rollNum);
		studentResult.setMarks(marks);
		studentResult.setTotalMark(doTotal(marks));
		return studentResult;
	}

	private Integer doTotal(Map<String, Integer> marks) {

		Iterator<String> markKeySet = marks.keySet().iterator();
		Integer total = 0;
		while (markKeySet.hasNext()) {
			String subject = markKeySet.next();
			Integer mark = marks.get(subject);
			total = total + mark;
		}

		return total;

	}
}
