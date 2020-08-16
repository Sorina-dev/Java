package com.class10.Arrays;

public class TrianglePattern {
	public static void main(String[] args) {
//		let us print the following pattern
//		*
//		**
//		***
//		****
//		*****
		for (int r = 1; r <=5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		let us print the second triangle
//		****
//		***
//		**
//		*
		for (int r = 4; r >=1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
