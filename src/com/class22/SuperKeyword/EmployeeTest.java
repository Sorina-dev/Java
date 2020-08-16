package com.class22.SuperKeyword;

public class EmployeeTest {
public static void main(String[] args) {
		
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.companyName="Facebook"; // can assign its value, cuz its different programm(main method)
		obj1.salary = 70000;
		obj1.getPaid();
		obj1.work();
		
		obj1.attendMeetings();
		obj1.ceremonies = "Scrum meetings";
		obj1.workBuildingSoft();
		
		ProductOwner obj2 = new ProductOwner();
		//ProductOwner.companyName have an access TOO
		obj2.salary = 100000;
		obj2.getPaid();
		obj2.work();
		
		obj2.ceremonies = "Scrum meetings";
		obj2.attendMeetings();
		obj2.workBuildingSoft();
		
		obj2.communicate();
	}
}
