package com.review.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class WritingIntoPropertyFile {
	
	//writing into existing file
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/Example.Properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		prop.setProperty("street", "New Brook Driver"); // we are loading data in java program
		
		//specifying path for different file
		String newPath = "configs/Browser.Properties";
		
		//if file is not there it will be created
		FileOutputStream fos = new FileOutputStream(newPath);
		prop.store(fos, "Added additional key");
		
		
	}
}
