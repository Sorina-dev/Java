package com.syntax.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Create a Map that will store Employee name and salary. Write a logic to retrieve an
 *  employee who gets the highest salary. Output should be in the below format
John Smith=$100000
 */
public class EmployeeMap {
public static void main(String[] args) {
	
	
	Map <String, Integer> employeeMap = new HashMap<>();
	employeeMap.put("Leonardo DiCaprio", 3497000);
	employeeMap.put("Tom Hanks", 5697000);
	employeeMap.put("Brad Pitt", 3457000);
	employeeMap.put("Tom Cruise", 56797000);
	employeeMap.put("Will Smith", 93497000);
	System.out.println(employeeMap);
	
	Set<Entry<String, Integer>> employeeEntrySet = employeeMap.entrySet();
	
	int highestSalary = 0;
	String highestSalaryEmployee = "";
	 
	for(Entry<String, Integer> entry : employeeEntrySet ) {
		if(entry.getValue()> highestSalary) {
			highestSalary = entry.getValue();
			highestSalaryEmployee = entry.getKey();
		}
	}
	System.out.println(highestSalaryEmployee + "=$" + highestSalary);
}
}
