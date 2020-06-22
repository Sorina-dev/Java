package com.syntax.class11;

public class RetrieveValuesFromTwoArrays {

	public static void main(String[] args) {
		//Put the months for one season in one row
		String[][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July","August"},
				{"September", "October", "November"}
		};
		
		int rows = months.length; //how many array/ rows are inside?
		System.out.println("Rows" + rows);
		
		int winterLength = months[0].length; // how many elements/ columns are in row with index 0
		System.out.println(winterLength + " months in row with index 0");
		int lastRowSize = months[rows -1].length; 
		
		System.out.println();
		//Nested loops are married to 2D Arrays
		for (int row = 0; row < months.length; row++) { // iterating over rows
			
			for (int col = 0; col < months[row].length; col++) { // iterating over columns
				System.out.print(months[row][col] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
