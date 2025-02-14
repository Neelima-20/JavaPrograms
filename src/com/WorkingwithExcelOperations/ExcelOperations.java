package com.WorkingwithExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		
		//Identify the excel in the system
		FileInputStream excelTestDataFile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\javascripts2\\src\\com\\WorkingwithExcelOperations\\ExcelBook1.xlsx");
		
	//Identify the workbook in the excel
		XSSFWorkbook excelworkbook=new XSSFWorkbook(excelTestDataFile);
	
		//Identify sheets in the workbook
		XSSFSheet workbooksheet=excelworkbook.getSheet("sheet1");
		
	//identify rows in sheet
		XSSFRow sheetofrow=workbooksheet.getRow(0);
		
		//identify cell in row
		XSSFCell cellofrow =sheetofrow.getCell(1);
	
		//To read the data into cell
		String testdata =cellofrow.getStringCellValue();
		System.out.println(testdata);
		
		
		

	}

}
