package com.review.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {

	public static void main(String[] args) throws IOException {

		String xlFile = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFile);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sample");

		Row row2 = sheet.getRow(1);

		String cell4 = sheet.getRow(1).getCell(3).toString();

		System.out.println(cell4);

		// how to get values from all rows and from all columns

		// 1. get number of rows

		int rows = sheet.getPhysicalNumberOfRows();

		// 2. get number of columns

		int cols = sheet.getRow(0).getLastCellNum();
		
		// 3. use nested for loop to iterate over rows and columns

		for (int r = 0; r < rows; r++) {// iterate over rows

			for (int c = 0; c < cols; c++) { // iterate over columns

				String value = sheet.getRow(r).getCell(c).toString();
				System.out.print(value + " ");
			}
			System.out.println();

		}

	}

}
