package com.class20.Constructor;

public class Student {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject grades.
	 * Inside your class also have a method to Calculate Average Grade. Test Student class 
	 * for 5 different students with different marks. Your program should print an average
	 *  mark of each students name.
	 */
	
	String name;
	int mathGrade, scienceGrade, historyGrade;
	
	Student(String studentName, int studentMathGrade, int studentScienceGrade, int studentHistoryGrade) {
		name = studentName;
		mathGrade = studentMathGrade;
		scienceGrade = studentScienceGrade;
		historyGrade = studentHistoryGrade;
	}

	int calculateAvarageGrade() {
		int avarage = (mathGrade + scienceGrade + historyGrade) / 3;
		return avarage;
	}
	
	
}
