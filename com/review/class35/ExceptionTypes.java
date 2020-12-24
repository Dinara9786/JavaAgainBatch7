package com.review.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		// Checked exception are the exception that checked by the compiler
		
		//Thread.sleep(2000); // checked exception.
		
		String xlFilePath = System.getProperty ("user.dir") + "/testdata/SampleTestData.xlsx";
		
		//FileInputStream fis = new FileInputStream (xlFilePath);// If file is not there, then Compiler makes us aware that there will be exception 
																//and we take a decision if take this exception
		
		// unchecked E = are E that no tchecked by the compiler
		
		int a = 10; 
		int b=0; 
		
		System.out.println(a/b); // we will get ArithmeticException // compiler cannot predict
		
		String str = null;
		System.out.println(str.length());
		
		
	}

}
