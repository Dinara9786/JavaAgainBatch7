package com.review.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
	public static void main(String[] args) throws IOException {

		String filePath = "configs\\Browser.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		String value1 = prop.getProperty("browser");
		System.out.println(value1);
		String value2 = prop.getProperty("url");
		System.out.println(value2);

		String value3 = prop.getProperty("username");
		System.out.println(value3);

		String value4 = prop.getProperty("password");
		System.out.println(value4);

	}

}
