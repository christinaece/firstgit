package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Crossby_Prac {
	
	@Test
	@Parameters({"chrome"})
	public void chrome(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		}
	@Test
	@Parameters({"firefox"})
	public void firefox(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		}

}
