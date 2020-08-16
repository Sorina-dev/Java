package com.class24.MethodOverriding_Polymorphism;

public class DegreeTest {
public static void main(String[] args) {
	
	Degree d = new Degree();
	d.getPrerequisite();
	
	Bachelors b = new Bachelors();
	b.getPrerequisite();
	
	Masters m = new Masters();
	m.getPrerequisite();
	
}
}
