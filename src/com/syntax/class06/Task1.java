package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your native country");
		String country = scan.next();
		String language;
		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "Romania":
			language = "Romanian";
			break;
		case "Bulgaria":
			language = "Bulgarian";
			break;
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "Argentina":
			language ="Spanish";
			break;
		case "France":
			language ="French";
			break;
			default:
				language = "Unknown";
		}
		
		System.out.println("Your native language is "+ language);
		     
		
			
			
		}
		
		
		
	}

