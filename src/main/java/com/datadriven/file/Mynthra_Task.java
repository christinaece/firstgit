package com.datadriven.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra_Task {
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Sel_Pro\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-jeans");
		
		 List<WebElement> list = driver.findElements(By.className("product-discountedPrice"));
		List<WebElement> list1 = driver.findElements(By.className("product-brand"));

		 File file=new File("C:\\Users\\Christina\\OneDrive\\Desktop\\Sudha.xlsx");
			FileInputStream Fis=new FileInputStream(file);
			
			Workbook wb=new XSSFWorkbook(Fis);
			Sheet createSheet = wb.createSheet("Arul");

			int rowNum=0;
			for(WebElement data:list) {
		String text = data.getText();
				Row createRow = createSheet.createRow(rowNum++);
				Cell Cell = createRow.createCell(0);
               Cell.setCellValue(data.getText());
               
               WebElement data2=list1.get(rowNum-1);
               String text2 = data2.getText();
Cell cell2 = createRow.createCell(1);
cell2.setCellValue(data2.getText());
			
					}
		
		
            FileOutputStream outputStream = new FileOutputStream(file);
            wb.write(outputStream);
            wb.close();

        } 
    }
