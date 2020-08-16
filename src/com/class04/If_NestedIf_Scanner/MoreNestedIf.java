package com.class04.If_NestedIf_Scanner;

public class MoreNestedIf {
public static void main(String[] args) {
	//date of month and day of week
	//if it is Friday --> we are going to watch a movie
	//              if date is 13 --> watch a Scary movie
	//                   if date is not 13 -->watch a Comedy
	// if it is not Friday --> we are going to study Java
	boolean isFriday = true;
	int date = 17;
	
	if (isFriday) {                                        //nested if open {
		System.out.println("We are going to watch a movie");
		if (date == 13){
			System.out.println("watch a Scary movie");
		} else {
			System.out.println("watch a Comedy");
		}
		
	}else {                                                //up to here close the }
		System.out.println("We are going to study Java ");
	}
}
}
