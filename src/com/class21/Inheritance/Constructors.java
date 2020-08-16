package com.class21.Inheritance;

public class Constructors {

String word;
	
	public Constructors() {
		System.out.println("I am a non argument constructor");
	}
	
	public Constructors(String word) {
		this(12, word); //IF NEED TO MAKE A CALL ALWAYS MUST BE A 1 STATEMENT INSIDE THE CONSTRUCTOR
		this.word=word;
		System.out.println("I am a parameterized constructor with str ="+word);
		//this(); CE: BECAUSE THIS MUST A 1 LINE
	}
	
	public Constructors(int num){
		System.out.println("I am constructor with 1 parameter ="+num);
	}
	
	public Constructors(int num, String word){
		System.out.println("I am constructor with 2 parameter ="+num+" and "+word);
	}
	
//	public Constructors(String str){ //CE: we cannot have duplicate constructors
//		System.out.println("I am constructor with 1 parameter ="+num);
//	}

	public static void main(String[] args) {
		
		Constructors obj=new Constructors("Java");
		System.out.println(obj.word);
	}
	
	void hello() {
		//this();can be sued only within constructors
	}
}
