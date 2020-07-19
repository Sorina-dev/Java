package com.syntax.class24;

public class BirdTest {
	public static void main(String[] args) {

		Bird bird=new BabyBird();//upcasting --> object of subclass is reffered by a Superclass
		//achieving runtime polymorphism
		bird.fly();
		bird.eat();
		bird.sleep();
		//bird.cry(); not available 
		//during compilation complier gives an access based on reference type
	
		System.out.println("-----------------------------------");
		BabyBird bb=new BabyBird();
		bb.fly();
		bb.sleep();
		bb.eat();
		bb.cry();
	}
}
