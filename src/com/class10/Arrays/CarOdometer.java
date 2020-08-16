package com.class10.Arrays;

public class CarOdometer {
public static void main(String[] args) {
//	we bought a new car
//	it starts with 0000 mileage and it increases
//	it goes 0001, 0002, 0003...9999
//	Please print every mileage
//	Hint: There are 4 inner loops
	
	for (int i = 0; i <= 9; i++) {
		for (int j = 0; j <= 9; j++) {
			for ( int k = 0; k <= 9; k++) {
				for (int m = 0; m <= 9; m++) {
					System.out.println(i +""+ j + k + m);
				}
			}
		}
	}
	
}
}
