package com.syntax.class22_1;

import com.class21.Inheritance.Cat;
import com.class22.SuperKeyword.Employee;

public class EmployeeTest {
public static void main(String[] args) { //another program for Employee class in a different package
		
		Employee emp=new Employee();
		Employee.companyName="Google";
		
		//new ScrumTeam();no available because it is default
		//new Cat();
		
		WaterFallTeam wt=new WaterFallTeam();
		WaterFallTeam.companyName="Amazon";
	}
}
