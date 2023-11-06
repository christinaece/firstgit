package com.datadriven.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_PRac {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Christina\\OneDrive\\Desktop\\write Data.xlsx");
		FileInputStream Fis=new FileInputStream(file);
		
		Workbook wb=new XSSFWorkbook(Fis);
		wb.createSheet("Blessy").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Blessy").getRow(0).createCell(1).setCellValue("Address");
		wb.getSheet("Blessy").getRow(0).createCell(2).setCellValue("Username");
		wb.getSheet("Blessy").createRow(1).createCell(0).setCellValue("Christina");
        wb.getSheet("Blessy").getRow(1).createCell(1).setCellValue("Chennai");
        wb.getSheet("Blessy").getRow(1).createCell(2).setCellValue("ecechris97@gmail.com");

FileOutputStream Fos=new FileOutputStream(file);
wb.write(Fos);
wb.close();

	}

}
