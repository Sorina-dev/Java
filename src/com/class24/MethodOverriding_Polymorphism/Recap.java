package com.class24.MethodOverriding_Polymorphism;

public class Recap {
	protected void bye() {
		System.out.println("bye");
	}

	protected void bye(String str, int num) {
		System.out.println(str);
	}

	protected void bye(int num, String str) {
		System.out.println(num);
	}
	
	private static void yes() {
		System.out.println("yes");
	}
	
	private static void yes(int num) {
		System.out.println(num);
	}
}
