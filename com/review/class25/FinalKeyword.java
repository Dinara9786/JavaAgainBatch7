package com.review.class25;

public final class FinalKeyword {
	
	public static String str ="Hello";
	
	public static final String USERNAME = "Admin"; // all final variable we put in Capital letters (not username but USERNAME)
	public final String PASSWORD = "Admin123"; // final can also be without static 
	//final is instance variable?????
	// final variables always and must be initialized
	
	//public = access modifier
	// static = non-access modifier, belongs to the class
	//final = not changeable
	
	public static void main(String[] args) {
		
		System.out.println(str);
		str = "hi";
		System.out.println(str);
		
		System.out.println(USERNAME);
		//username = "admin1";// username is final and cannot be re-assigned and changed its value. This variable is final and it is constant.
		FinalKeyword fk = new FinalKeyword();
		//fk.Password = "user123"; CE: variable is final fk.Password = "user123
		System.out.println(fk.PASSWORD);
		
	}
	public final void hello() { // no one else can change impelmentation completed. Final method means completed
		System.out.println("Last hello of today");
	}
}

//class FinalBaby extends FinalKeyword { NO INHERITANCE, FINAL CANNOT BE EXTENDED BECAUSE PARENT CLASS IS FINAL
//	
//	// FINAL METHODS CANNOT BE OVERRIDDEN
////	public void hello() {
////		System.out.println("Sorry it is not last hello");
//	}



