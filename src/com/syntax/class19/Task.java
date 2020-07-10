package com.syntax.class19;



public class Task {

	
	//3rd private static 
	int[] array;
	
	protected static int sum(int[] array2) {
		int total = 0;

		for (int element : array2) {
			total = total + element;
		}

		return total;
	}
	
	
	}

