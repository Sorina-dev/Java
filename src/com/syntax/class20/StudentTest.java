package com.syntax.class20;

public class StudentTest {

public static void main(String[] args) {
		
		Student student1 = new Student("Smith", 70, 80, 83);
		Student student2 = new Student("Adam", 49, 23, 94);
		Student student3 = new Student("Lucy", 98, 53, 45);
		Student student4 = new Student("Mary", 78, 15, 0);
		Student student5 = new Student("Ahmet", 67, 89, 99);
		
		System.out.println(student1.calculateAvarageGrade());
		int grade2=student2.calculateAvarageGrade();
		System.out.println("Average grade of 2 student is "+grade2);
		
		System.out.println(student2.calculateAvarageGrade());
		System.out.println(student3.calculateAvarageGrade());
		System.out.println(student4.calculateAvarageGrade());
		System.out.println(student5.calculateAvarageGrade());
	}
	
}
