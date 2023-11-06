package com.adactinPro.Adactin_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class App extends Base_Class {
  public static void main(String[] args) throws IOException, InterruptedException {
	  
	  browser_Launch();	  
	  maximize();
	  getUrl("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@id='email']")). sendKeys("Joys");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   screenShot("fb.png");
		  getUrl("https://letcode.in/dropdowns");
			WebElement multiselect = driver.findElement(By.id("superheros"));
			muti_Dropdown(multiselect, 0,1);//Multi Select
	         
  }
}
