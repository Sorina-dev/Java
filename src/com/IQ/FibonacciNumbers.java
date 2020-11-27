package com.IQ;

public class FibonacciNumbers {
	
	/*
	 * The Fibonacci series is a series where the next term is the sum of pervious two terms. 
	   The first two terms of the Fibonacci sequence is 0 followed by 1.
	   0 1 1 2 3 5 8 13 21 34
	 */

	public static void main(String[] args) {
		
		int a,b,c;
		a = 0;
		b = 1;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}
		
		
	}
}
