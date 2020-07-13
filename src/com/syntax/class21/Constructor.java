package com.syntax.class21;

public class Constructor {

	Constructor() {
		this(1);
		System.out.println("Hi");
	}

	Constructor(int x) {
		this(1, 2);
		System.out.println("Hello");
	}

	Constructor(int x, int y) {
		System.out.println("How are you");
	}

	public static void main(String[] args) {
		System.out.println();
		Constructor obj = new Constructor();
		
	}
}
