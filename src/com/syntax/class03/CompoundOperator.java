package com.syntax.class03;

public class CompoundOperator {

	public static void main(String[] args) {
		int num= 100;
		num = num+100; // 200
		System.out.println(num);
		
		num = num+100;
		System.out.println(num); //300
		//we can use Compound operators which are shorter
		num += 100;//no space between +=
		System.out.println(num);//400
		
		//long way
		num=num-50;
		//short way
		num -= 50;
		System.out.println(num);
		num/=7;
		System.out.println(num);
		
		//num = num * 2;
		num *= 2;
		System.out.println(num);
		
		//num = num%9;
		num %= 9;
		System.out.println(num);
		
		
		
		
		int myNumber = 4;
	    int stepOne = myNumber * myNumber;
	    int stepTwo = stepOne + myNumber;
	    int stepThree = stepTwo / myNumber;
	    int stepFour = stepThree + 17;
	    int stepFive = stepFour - myNumber;
	    int stepSix = stepFive / 6;
	    
	    System.out.println("The magic number is " + stepSix + '!');
		

	}

}
