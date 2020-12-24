package com.review.class04;

public class Mortgage {
	
	public static void main(String[] args) {
		
		double rate = 12.5;
		int price = 29432400;
		
		if (rate >4.5) {
			System.out.println("The user will not buy a house"); 
		}else {
			System.out.println("The user can consider buying a house");
			if (price >200000) {
				System.out.println("The user can take a loan");
			}else {
				System.out.println("User can pay cash");
			}
		}
	}

}
