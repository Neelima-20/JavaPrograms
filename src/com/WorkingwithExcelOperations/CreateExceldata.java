package com.WorkingwithExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExceldata {

	public static void main(String[] args) throws IOException {
		FileInputStream exceltestdata=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\javascripts2\\src\\com\\WorkingwithExcelOperations\\ExcelBook1.xlsx");
		XSSFWorkbook excelworkbook =new XSSFWorkbook(exceltestdata); 
		XSSFSheet sheetofworkbook =excelworkbook.createSheet("sheet2");
		XSSFRow rowofsheet = sheetofworkbook.createRow(3);
		XSSFCell cellofrow =rowofsheet.createCell(3);
		cellofrow.setCellValue("Testing");
		FileOutputStream saveExcelTestDataFile = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\javascripts2\\src\\com\\WorkingwithExcelOperations\\ExcelBook1.xlsx");
		excelworkbook.write(saveExcelTestDataFile);
	}

}
