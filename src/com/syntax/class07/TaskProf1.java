package com.syntax.class07;

public class TaskProf1 {
public static void main(String[] args) {
	//how to print odds numbers from 1 to 20
	//1,3,5,7,9,11,13,15,17,19
	
	//wrong way, go to jail
	//because of code redundancy
//	System.out.println("1");
//	System.out.println("2");
//	System.out.println("3");
//	System.out.println("5");
//	System.out.println("7");
//	System.out.println("9");

    //1st way, using mod (%)
	int x = 1;
	while (x < 20) {
		if(x % 2 == 1) {
			System.out.println(x);
		}
		x++;
	}
	System.out.println("-------------------------------------");
	
	//2nd way,increasing by 2
	int y = 1;
	while (y <=20) {
		System.out.println(y);
		y +=2;
	}
	System.out.println("------------------------------------");
	
	//3rd way
	int z =0;
	while (z<0) {
		z++;
		System.out.println(z);
		z++;
	}
	System.out.println("-----------------------------------");
	
	//4th way
	int g = 0;
	while (g < 20) {
		System.out.println(++g);
		g++;
	}
	
}
}
