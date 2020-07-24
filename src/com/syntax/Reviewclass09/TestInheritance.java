package com.syntax.Reviewclass09;

public class TestInheritance {
	public static void main(String[] args) {
		
		Student stu1=new Student("Michael", "Knight", "ST2222");
		
		Student stu2=new Student("Jimmy", "Jones", "ST1111");
		
		School school=new School("Indiana", "Johns");
	
		School stu3=new Student("Donald", "Duck", "DD1234");
		
//		stu3.printDetails();
		
		
		School.schoolName="Syntax Technolgies";
		
		System.out.println(School.schoolName);
		
		System.out.println(stu2.schoolName);
		
		
		
	}
}
