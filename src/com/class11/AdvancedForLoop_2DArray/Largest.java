package com.class11.AdvancedForLoop_2DArray;

public class Largest {
public static void main(String[] args) {
	//Find the largest number in array
	int[] numbers = {23, 56, -73, 16, 80, 70, -39};
	
	int largest = numbers[0];
	for (int num : numbers) {
		if (num > largest) {
			largest = num;
		}
	}
	System.out.println(largest);
}
}
