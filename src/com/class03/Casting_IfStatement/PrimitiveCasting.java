package com.class03.Casting_IfStatement;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//widening, implicit casting, automatically java already knows/ smaller into bigger
		double d = 7;
		System.out.println(d);
		
		//int i = 7.58;//compile type error; Type mismatch cannot convert from double to int
		// narrowing, explicit casting, manually, the order not respected
		int i = (int) 7.58;//forcing java to covert into anther type bigger to smaller
		System.out.println(i);
		
		// narrowing a large number into a byte
		byte b = (byte) 127263263;//java cut the int part into a byte
		System.out.println(b);
		
		long l1  = 45;
		long l2 = 7243657815l;
		//narrowing, explicitly doing it , manually
		// trying to fit smth from a big box into a small box
		int number1 = (int)l1;
		System.out.println("number1 = " +number1);
		int number2 = (int)l2;
		System.out.println("number2 = " +number2);
		
		
		

	}

}
