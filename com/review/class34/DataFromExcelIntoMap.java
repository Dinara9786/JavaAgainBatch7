package com.review.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);
		// create an Object of Workbook
		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sample");
		// get number of rows adn cols
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		//create an empty LIst
		List<Map<String, String>> xlList = new ArrayList<>();
		//loop over columns
		for (int r = 1; r < rows; r++) {
			//for every column create a new Map
			Map<String, String> map = new LinkedHashMap<>();
			// loop over every column
			for (int c = 0; c < cols; c++) {
				// get keys from 1 row (header)
				String key = sheet.getRow(0).getCell(c).toString();
				// get values from other rows
				String value = sheet.getRow(r).getCell(c).toString();
				// store values from each cell of the row into a map
				map.put(key, value);
			}
			//add created map with values into List
			xlList.add(map);
		}
	
		System.out.println(xlList + " ");
		System.out.println("===Printing 1 by 1==============");
		for (Map<String, String> littleMap: xlList) {
			System.out.println(littleMap);
			
		}
		
		// extract data from Username and Passwrod excel and store inside list of Maps
		//HW create 10 usernames adn stores in excel file class 34 from 3.15
		

	}
	
}
