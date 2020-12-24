package com.review.class35;

public class CatchingException {
	
	public static void main(String[] args) {
		
		int a = 10; 
		int b = 0; 
		
		try {
			System.out.println(a/b);
			// throw new ArithmeticException ();
		} catch (Exception ae) {
			//Exception ae = new ArithmeticException();
			// ArithmeticException // name, description-message, and adn whihc line it occurs
			//System.out.println(ae.getMessage()); // shows the message
		}
		
		System.out.println("End of the code");
	}

}
