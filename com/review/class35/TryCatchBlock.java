package com.review.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {
	
	public static void main(String[] args) {
		
		String xlFilePath = System.getProperty("user.dir")+"/testdata/SampleTestData.xlsx"; 
		
		try {// code that might throw an exception
				
		FileInputStream fis = new FileInputStream (xlFilePath);
		
		}catch (FileNotFoundException fne) { // catching right exception
			
			System.out.println("I caught the exception");
			
		}
		System.out.println("End of code");
		
		System.out.println("=========================================");
		
		
		
		int [] array = {10, 20};
	try {
		
		//System.out.println("I am a beginning of the try block");
		System.out.println(array[2]);
		//System.out.println("I am the end of the try block");

	} catch (ArrayIndexOutOfBoundsException aiob) {
		//System.out.println("I am a beginning fo the catch block ");
		//System.out.println("I am Array Index Out Of Bounds Exception");
		System.out.println("I am the end fo the catch block ");

		
	}
	System.out.println("End of code");
}
}
