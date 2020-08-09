package com.syntax.class31;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Create a Set collection that will hold Objects of Student Type. 
In this set we do not care about the insertion order. Each student object should have name and studentID.
 Display name of each student.
 */
public class Student {
	String name; int id;
	Student(String name, int id){
		this.name= name;
		this.id = id;
	}

public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
	students.add(new Student("Maria", 20));
	students.add(new Student("Ivan", 21));
	students.add(new Student("Natalia", 22));
	students.add(new Student("Igor", 23));
		
	Iterator<Student> it = students.iterator();
	  while(it.hasNext()) {
		  Student studentName = it.next(); //taking the object
		  System.out.println(studentName.name); //printing the variable
	  }
}

}

