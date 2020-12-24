package com.review.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {
	
	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlPath);
		
		Workbook workbook =new XSSFWorkbook (fis); // XSSWorkbook is a class of Workbook Interface
		
		Sheet sheet = workbook.getSheet("Sample");
		
		Row row1 = sheet.getRow(0);
		
		Cell row1cell3 = row1.getCell(2);
		
		String value = row1cell3.toString();
		
		System.out.println(value); // LastName
		
		Row row2 = sheet.getRow(1);
		
		String  valueOfAnotherSell= row2.getCell(0).toString();
		
		System.out.println(valueOfAnotherSell);
		
		
		
	}

}
