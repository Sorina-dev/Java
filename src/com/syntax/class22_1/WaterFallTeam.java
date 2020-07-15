package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee{
public void slowWork() {
		
	}
	
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		WaterFallTeam.companyName="Google";
		wt.fullName="John Snow";//protected variable is accessible to different class through inheritance
		System.out.println(wt.fullName);
		
		Employee emp=new Employee();
		
	
	}
}
