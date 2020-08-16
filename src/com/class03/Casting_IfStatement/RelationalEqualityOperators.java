package com.class03.Casting_IfStatement;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		int a =7;
		int b = 10;
		System.out.println(3>4);//false
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b); //false
		System.out.println(a != b);//different , true
		
		System.out.println("----------------------------");
		
		double i= 10.78;
		double j = 10.55;
		boolean result1 = i>j;
		System.out.println(result1);//use boolean for comparing 
		
		boolean result2 = i==j;
		System.out.println(result2);
		
		boolean result3 = i != j;
		System.out.println(result3);
		
		boolean result4= i>=j;// comparison operators "bigger or equal to"
		System.out.println(result4);
		
		boolean result5= i<=j;
		System.out.println(result5);
		
			
		
		
		
		
	}

}
