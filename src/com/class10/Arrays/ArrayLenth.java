package com.class10.Arrays;

public class ArrayLenth {
public static void main(String[] args) {
	String[] group1 = new String[5];
	
	group1[3] = "Kamila";
	group1[1] = "Elshan";
	group1[4] = "Yuriy";
	// group1[5] = null; --> as the String[5] has 5 elements, and the values is not assigned
	// so it goes with the default value of the data type
	
	 
	System.out.println(group1[0]);
	System.out.println(group1[1]);
	
	int arrLength = group1.length;
	System.out.println("The lenght of the array is: " + arrLength);
	
	System.out.println("********************************************");
	
	String[] group2 = {"Ali", "Xenia", "Olga", "Castro"};
	System.out.println("The lenght of the group 2 is: " + group2.length);
	
	//HW create an array od 4 integers and see the default values
	
	
	
	
}
}
