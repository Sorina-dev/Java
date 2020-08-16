package com.class07.Loops;

public class ForLoop {
	public static void main(String[] args) {
		//print numbers from 1-5
		
		int a = 1;
		while (a<=5) {
			System.out.println(a);
			a++;
		}
		
		//when we know how many times it will execute, we will go with For Loop
		for (int num = 1; num <= 5; num ++) {
			System.out.println(num);
		}
	}

}
