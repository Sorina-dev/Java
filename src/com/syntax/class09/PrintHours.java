package com.syntax.class09;

public class PrintHours {
public static void main(String[] args) {
	//let us print the clock
	//00:00
	//00:01
	//...
	//01:00
	//23:59
	//hours go from 00 to 23
	// minute goes from 00 to 59
	for (int hour = 0;  hour < 24; hour++) {
		for (int min = 0; min < 60; min++) {
			if(min < 10) {
				System.out.println(hour + ":0" + min);
			}else {
				System.out.println(hour + ":" + min);
			}
		}
	}
	
	
}
}
