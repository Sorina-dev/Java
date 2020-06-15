package com.syntax.class04;

public class NesteIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> You're healthy
		// otherwise:
		// peanut allergy --> Don't eat peanut
		// lactose allergy --> Don't drink milk
		// bee allergy --> Don't mees with bees
		// seafood allergy -->Don't eat fish
		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;

		if (!allergy) { // no allergy ! sign
			System.out.println("You're healthy");
		} else {
			if (peanut) {
				System.out.println("Don't eat peanut");
			}
			if (lactose) {
				System.out.println("Don't drink milk"); // if using "else if" there is another condition if the 1st
														// isn't true
			}
			if (bee) { // if using only "if" it would be checked in the nested if
				System.out.println("Don't eat fish");
			}
		}

	}
}
