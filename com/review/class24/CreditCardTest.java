package com.review.class24;

class CreditCardTest {

public static void main (String [] args) {
		
		CreditCard crd = new CreditCard(9000);
		crd.interest = 24;
		double interest = crd.dailyInterest();
		System.out.println("Interest for each business day = " + interest);
		
		Visa vs = new Visa(500);
		double bl = vs.dailyInterest();
		System.out.println("Interest for each business day via Visa = " + bl);
		
		AX ax = new AX(800);
		double axe = ax.dailyInterest();
		System.out.println("Interest for each business day via AX = " + axe);
		
	}	
		
	}

