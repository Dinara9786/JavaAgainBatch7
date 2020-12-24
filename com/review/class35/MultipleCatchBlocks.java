package com.review.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		
		
		String file = System.getProperty("user.dir")+"/testdata/SampleTestData.xlsx"; 
		
		try {
			FileInputStream fis = new FileInputStream (file);
			Workbook book = new XSSFWorkbook(fis);
			
			// when we have 2 or more catch block 
			//	ALWAYS START WITH MOSTS SPECIFIC CATCH --->> THEN WE GO TO THE GENERIC CATCH 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) { // we can easily survive with IOException catch block
			
			e.printStackTrace();
		}
		System.out.println("===========================");
	}

}
