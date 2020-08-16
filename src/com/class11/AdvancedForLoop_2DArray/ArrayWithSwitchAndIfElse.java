package com.class11.AdvancedForLoop_2DArray;

public class ArrayWithSwitchAndIfElse {

	public static void main(String[] args) {
		//create an array of countries
		//while retrieving all values from the array print the capital for each country
		
		String[] countries = {"Tajikistan", "Brasil", "Pakistan", "Gambia", "US"};
		
		//Elion way, the capitals must be the same order in order to work
		String[] capitalCities = {"Dushanbe", "Brasilia", "Islamabad", "Banjul", "Washington DC"};
		
		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital city of "+ countries[i] + " is "+ capitalCities[i]);
		}
// HW: Try to solve this way with one enhanced loop
		//Hint: you should not be able to do it
//		System.out.println(--------------with If Else---------------------);
//		
//		for (String country : countries) {
//			
//			if (country.equals("Albania")) {
//				System.out.println("Tirana");
//			}else if (country.equals("Brazil"){
//				System.out.println("Brasilia");
//			}else if (country.equals("Pakistan")) {
//				System.out.println("Islamabad");
//			}else if (country.equals("Gambia")) {
//				System.out.println("Banjul");
//			}else if (country.equals("US")) {
//				System.out.println("Washington DC");
//			}else {
//				System.out.println("The country " + country + " is not in my list");
//			}
//		}
//	System.out.println("----------------------with Switch----------------");
//	
//	for (int i = 0; i < countries.length; i++) {
//		
//		switch (countries[i]) {
//		case "Tajikistan":
//			System.out.println("Dushanbe");
//			break;
//		case "Brasil":
//			System.out.println("Brasilia");
//			break;
//		case "Pakistan":
//			System.out.println("Islamabad");
//			break;
//		case "Gambia":
//			System.out.println("Banjul");
//			break;
//		case "US":
//		case "USA":
//			System.out.println("Washington DC");
//			break; 
//			default:
//				System.out.println("Not in my list");
//		}
//	}
	
	}

}
