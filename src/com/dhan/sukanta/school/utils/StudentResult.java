package com.dhan.sukanta.school.utils;

import java.util.Map;

public class StudentResult {

	private int roll;
	private Map<String, Integer> marks;
	private int totalMark;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	@Override
	public String toString() {
		return "StudentResult [roll=" + roll + ", marks=" + marks + ", totalMark=" + totalMark + "]";
	}


}
