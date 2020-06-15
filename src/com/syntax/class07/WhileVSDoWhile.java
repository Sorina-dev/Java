package com.syntax.class07;

public class WhileVSDoWhile {
public static void main(String[] args) {
	//print Hello 3 times
	
	int x = 11;
	while(x<=3) {
		System.out.println("Hello");
		x++;
	}
	System.out.println("----------Do while loop---------------------");
	
	int y = 11;
	do {
		System.out.println("Hello");
		y++;
	}while(y<=3);  //checks after going into the loop
	
	//while - checks if soup is hot, before eating
	//do while - checks if soup is hot, after eating
	//with do while loop you will get burn!! 
}
}
