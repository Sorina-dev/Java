package com.class23.MethodOverloading;

public class TestSumMethods {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		double result=obj.sum(10.99,2.99);
		
		System.out.println(obj.sum(10, 20, 30));
		System.out.println();
	}
}
