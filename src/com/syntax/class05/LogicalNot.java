package com.syntax.class05;

public class LogicalNot {
	public static void main(String[] args) {

		boolean b1 = !true;
		System.out.println(b1);//->false
		
		boolean b2 = !false;
		System.out.println(b2);//->true
		
		boolean cold=true;
		
		if (!cold){
			System.out.println(1);  //it means false as boolean cold = true; 
		}else {                     // so the else condition will be executed
			System.out.println(2);
		}
		System.out.println("******************************************");
		//If it is not Monday or Friday we have a class
		int day = 4;
		//if(day!=1||day!=5)->doesnt't work
		
		//1st way
		if(day!=1 && day!=5) {
			System.out.println("we have a class");
		}else {
			System.out.println("we are sleeping");
		}
		//2nd way, similar
		if(!(day==1) && !(day==5)) {
			System.out.println("we have a class");
		}else {
			System.out.println("we are sleeping");
		}
		// 3rd way, easiest
		if(!(day==1||day==5)) {
			System.out.println("we have a class");
		}else {
			System.out.println("we are sleeping");
		}
	}
}
