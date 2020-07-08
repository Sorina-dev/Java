package com.syntax.class14;

public class School {
	//related to Student Class
	public static void main(String[] args) {
		Student student=new Student();
		student.name = "John";
		student.lastName = "Doe";
		student.study();
		
		Student student1 = new Student();
		student1.name = "Jane";
		student1.lastName = "Smith";
		student1.study();
		
	}
}
