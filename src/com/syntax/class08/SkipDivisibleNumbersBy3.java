package com.syntax.class08;

public class SkipDivisibleNumbersBy3 {
	public static void main(String[] args) {
		//print numbers from 1-50 except those that are divisible by 3
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {  //divisible by 3
				continue;
			}
			System.out.println(i);
		}
	}

}
