package com.class19.AccessModifiers;

public class AccessingEmployeeClassMemebers {
public static void main(String[] args) {
		//related to Employee
		Employee emp=new Employee();
		emp.name="Godze";
		emp.lastName="Doe";
		emp.age=30;//accessing protected
		emp.salary=100000;//accessing default
		//emp.ssn --> wont be available because it is private

		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySsn();//wont be available because it is private
	}

}
