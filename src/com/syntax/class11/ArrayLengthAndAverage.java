package com.syntax.class11;

public class ArrayLengthAndAverage {
	public static void main(String[] args) {
		int[] grades = new int[5];
		
		int size = grades.length;
		System.out.println("Array size is "+ size);
		
		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		
		//What is the average of the class?
		//1st silly way
		int average = ((grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / size);
		System.out.println("Class average is: " + average);
		
		//2nd best way
		int total = 0;
		for (int k = 0; k < size; k++) {
			total += grades[k];
		}
		System.out.println("Class average is: " + total / size);
		
		System.out.println("-------------------------------------------------");
		
		String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington DC", "Arlington", "NY", "LOrton", "Chicago"};
		//I live in Tampa
		System.out.println("I live in "+ cities[2]); 
		
		int i = 1;
		System.out.println("I live in " + cities[i]); // Kiev
		
		i += 2;
		System.out.println("I moved to "+ cities[i]); // Washington DC
		
		int cityLength = cities.length;
		System.out.println("The total number of cities is " + cityLength);
		
		System.out.println("The last city in the list is " + cities[cityLength - 1]); // or [cities.length - 1]
		
		System.out.println("----------------------------------------------");
		
		//I want to print all the cities
		// cities[0], cities[1],....cities[7]
		for (int j = 0; j < cities.length; j++) {
			System.out.println(cities[j]);
		}
 		
}}
