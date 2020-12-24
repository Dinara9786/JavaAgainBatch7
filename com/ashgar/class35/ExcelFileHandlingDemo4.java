package com.ashgar.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandlingDemo4 {
	
	public static void main(String[] args) throws IOException {
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Sample");
		
		for (int row = 0; row <sheet.getPhysicalNumberOfRows(); row++) {
			Row rowData = sheet.getRow(row);
			for (int j=0; j<rowData.getPhysicalNumberOfCells(); j++) {
				System.out.print(rowData.getCell(j) + " ");
			}
			System.out.println();
		}
		
//		Row row = sheet.getRow(1);
//		
//		Cell cell = row.getCell(0);
//		
//		String value1 = cell.getStringCellValue();
//		
//		System.out.println(value1);
//		
//		String value2 = row.getCell(1).getStringCellValue();
//		
//		String password = row.getCell(4).getStringCellValue();
//		System.out.println(password);
//		
//		Row row3 = sheet.getRow(2);
//		
//		Cell cell5 = row.getCell(4);
//		
//		String password1 = cell.getStringCellValue();
//		
//		//String password1 = row.getCell(4).getStringCellValue();
//		
		
		
	}

}
