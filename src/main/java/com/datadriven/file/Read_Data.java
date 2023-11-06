package com.datadriven.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\File\\Read Data.xlsx");
	
	FileInputStream Fis=new FileInputStream(file);
	
	Workbook wb=new XSSFWorkbook(Fis);
	
	Sheet sheet = wb.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(2);

for(int i=0;i<=2;i++) {
	for(int j=0;j<=5;j++) {
		Row row2 = sheet.getRow(j);
		Cell cell2 = row2.getCell(i);
		System.out.println(cell2);
	}
}
	
}	
}