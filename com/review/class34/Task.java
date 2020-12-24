package com.review.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	// Manually create a file to store username and password
	//Using java add 2 more lines for username and password
	// Save code in the same file 
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/testdata/TaskFile.xlsx";
		
		FileInputStream fis = new FileInputStream (filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet");
		
		sheet.createRow(1).createCell(0).setCellValue("Admin");
		
		sheet.createRow(1).createCell(1).setCellValue("Admin123");
		
		//String filePath = System.getProperty("user.dir") + "/testdata/TaskFile.xlsx";
		
		FileOutputStream fos = new FileOutputStream (filePath);
		
		book.write(fos);
		
		
		
		
	}

}
