package com.syntax.class10;

public class DollarMagic {

	public static void main(String[] args) {
//		lets print the dollar
//		$$$$
//		$  $
//		$  $
//		$  $
//		$$$$

		for (int r = 1; r <= 5; r++) { //The outer loop controls the rows
			for (int c = 1; c <= 4; c++) { //the inner loop controls the columns
				if (r == 1 || r == 5) { //in the 1st or last row print every $
					System.out.print("$");
				}else {// in the other rows
					if (c == 1 || c == 4) { // the 1st and last column print $
						System.out.print("$");
					}else { // in the other columns print " "
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	

}
