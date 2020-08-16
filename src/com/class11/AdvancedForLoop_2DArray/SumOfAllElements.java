package com.class11.AdvancedForLoop_2DArray;

public class SumOfAllElements {
public static void main(String[] args) {
	//Create an array on integers
	//calculate the sum of all elements in the array
	
	int[] numbers = {23, 56, 73, 16, 80, 70, 39};
	int sum = 0;
	
	for (int num : numbers) {
		sum += num;
	}
	System.out.println("The sum of all numbers is "+ sum);
	
	System.out.println("-----------Using for loop -------------");
	int total = 0;
	for (int i = 0; i < numbers.length; i++) {
		int num = numbers[i];
		total += num;
	}
	System.out.println("The sum of all numbers is "+ total);
}
}
