package com.IQ;

public class FizzBuzz {

	/*
	 * write a program that prints out numbers from 1 to 100 under the following
	 * conditions: Multiplies of 3(3, 6, 9...)must be replaced by the word "Fizz" in
	 * printout, multiplies of 5(5, 10, 15,..) must be replaced by the word "Buzz"
	 * and multiplies of both 3 and 5 (15, 30, 45...)must be replaced by FizzBuzz
	 * 
	 */

	public static void main(String[] args) {

		// loop for 100 times
		for (int i = 1; i <= 100; i++) {
			// number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of
			// the number
			if (i % 15 == 0)
				System.out.print("FizzBuzz" + ", ");
			// number divisible by 5, print 'Buzz' in place of the number
			else if (i % 5 == 0)
				System.out.print("Buzz" + ", ");
			// number divisible by 3, print 'Fizz' in place of the number
			else if (i % 3 == 0)
				System.out.print("Fizz" + ", ");

			else
				System.out.print(i + ", ");
		}

	}

}
