package com.IQ;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/**
		 * A whole number greater than 1 that can not be made by multiplying other whole numbers.

Example: 5 is a prime number. We cannot multiply 2, 3 or 4 together to make 5. (Only 1×5 works but we said to use other whole numbers.)

Example: 6 can be made by 2 × 3 so is NOT a prime number (it is a composite number).

All whole numbers above 1 are either composite or prime.

1, 2, 3, 5, 7, 11, 13, 17, 19, 23..
		 */
		
		int number = 10;
		boolean isPrime = true;
		
		if(number>1) {
			for(int i = 2; i<number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}else {
			isPrime = false;
		}
		System.out.println("The number "+ number + " is prime? " + isPrime);
	}
}
