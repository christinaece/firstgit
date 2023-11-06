package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_Test {
	                 //username, password
	String [][] data={{"Joys", "Joys123@"},
	                   {"Blessy", "Blessy123@"},
	                   {"Rayman", "Rayman123@"},
	                   {"Arulmani", "Arulmani123@"}};
	
	@DataProvider(name="fblogin")
	public String [][] fblogin(){
		return data;
	 		  
			          }
	@Test(dataProvider="fblogin", timeOut=5000)
	public void getInput(String username, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();

	}
			          
	}

//Dataprovider returns the 2dimentional Java object to the test method.

