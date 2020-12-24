package com.review.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {

		// this is path of Example.properties
		// C:\Users\drysa\eclipse-workspace\JavaAgain\configs\Example.properties

		// 1. identify path to the file we want to read
		String filePath = "configs/Example.properties";

		// 2. create an object of FileInputStream class

		FileInputStream fis = new FileInputStream(filePath);

		// 3. to work with property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fis);

		String value1 = prop.getProperty("username");
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);
		
		System.out.println(prop.getProperty("password"));
		
		String value3 =prop.getProperty("address");
		System.out.println(value3);

	}
}
