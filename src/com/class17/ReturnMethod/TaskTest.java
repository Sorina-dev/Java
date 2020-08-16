package com.class17.ReturnMethod;

public class TaskTest {
	//related to Task class
public static void main(String[] args) {
		
		Task t=new Task();
		String email=t.createEmail("Jane", "Smith", "yahoo");
		System.out.println(email);
		
		boolean prime=t.isPrime(2);
		System.out.println(prime);
		
		Student student=new Student();
		
		char grade=student.getGrade(75);
		char grade1=student.grade(75);
		
		System.out.println("Value of grade="+grade);
		System.out.println("Value of grade1="+grade1);
}
}
