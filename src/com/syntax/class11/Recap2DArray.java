package com.syntax.class11;

public class Recap2DArray {
public static void main(String[] args) {
	String[][] animals = {
			{"cat", "dog","bird","hamster"},//1st array or row
			{"tiger","children", "bear"}, //2nd array or row
	};
	int howManyArrays = animals.length; //how many rows
	System.out.println(howManyArrays);
	
	int element1Array = animals[1].length; // how many columns in 2 row
	System.out.println(element1Array);
	
	String element = animals[1][1];
	System.out.println(element); //children
	
	System.out.println("********************retrieve elements from 2D array*************");
	
	for (int r = 0; r < animals.length; r++) {//loop over rows or 1D array
		for (int c = 0; c < animals[r].length; c++) {
			String animal = animals[r][c];
			System.out.print(animal + " ");
		}
		System.out.println();
	}
	
}
}
