package com.datadriven.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Christina\\OneDrive\\Desktop\\write Data.xlsx");
		FileInputStream Fis=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(Fis);
		wb.createSheet("Christinas").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("Christinas").getRow(0).createCell(1).setCellValue("Password");
		
		FileOutputStream Fos=new FileOutputStream(file);
		wb.write(Fos);
		wb.close();
		
		
		
		
		
	}

}
