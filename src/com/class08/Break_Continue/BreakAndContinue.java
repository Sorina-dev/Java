package com.class08.Break_Continue;

public class BreakAndContinue {
public static void main(String[] args) {
	//we are continuing from 1-10
	//we want to stop the loop when reach 4
	
	System.out.println("--------------Break-----------");
	for(int i = 1; i<=10; i++) {
		if(i==4) {
			System.out.println("I am stopping the loop");
			break;
		}
		System.out.println(i);
	}
	System.out.println("we are outside the loop");
	System.out.println("------------Continue-------------");
	
	for (int i =1; i<=10; i++) {
		if(i==4) {
			System.out.println("I am skipping");
			continue;
		}
		System.out.println(i);
	}
	System.out.println("we are outside of the loop");
}

}
