package com.review.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer ("Hello");
		//StringBuffer is a class adn very similar to String and it is also a collection of characters.
		// StringBuffer is mutable, this class is changeable
		// a new object is not created and no re-assigning
		
		strBuffer.append(" Friends "); // we do not have to re-assign in case of stringBuffer
		System.out.println(strBuffer);// output: Hello Friends // with no re-assigning
		// when we perform operations it happends on same Object and no NEW object gets created. 
			
		String str2 = "Hello"; // String is Immutalbe object = not changeable 
		str2.concat(" friends"); // new objects gets created that no one takes it and because no re-assigning a new variable
		
	}

}
