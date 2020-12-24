package com.review.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies -- > you are healthy
		// otherwise:
		// if peanut allergy; do not peanut
		// if lactose allergy:  do not drink milk 
		// if bee allergy: do not mess with bees
		// if seafood : do not eat fish
		
		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;
		
		
		if (!allergy) {
			System.out.println("You are healthy");
		}else {
			if (peanut) {
				System.out.println("Do not eat peanut");
			} if (!lactose) {
				System.out.println("Do not drink milk");
			}  if (bee) {
				System.out.println("do not mess with bees");
			}  if (seafood) {
				System.out.println("do not eat fish");
			}
		
		
		}
		
		
	}

}
