package com.syntax.class02;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int num3=num1;
		System.out.println(num3);
		
		//can do Arithmetic operations on numbers only not strings
		int sum = num1 + num2;
		int sub= num1 - num2;
		int div = num1 / num2;
		int mult=num1*num2;
		
		System.out.println(sum);//addition
		System.out.println(sub);// substraction
		System.out.println(div);//division
		System.out.println(mult);//multiplication
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1 + d2;
		System.out.println(dSum);
		
		double dSum3 = 15;
		//can store an int as a double
		double dSum2 = num1 + num2;
		System.out.println("dSum2 ->" + dSum2);
		
		
		System.out.println("addition->" + num1 + num2);
		
		//order of operation
		System.out.println("Ahmet" + 10 +30);//concatenetion
		System.out.println("Ahmet" + (10 +30));//brakes then result
		System.out.println("Ahmet_" + 10 *30);// multiplication then result
		

		
		
	}

}
