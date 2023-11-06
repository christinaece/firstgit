package com.testng_Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin_Prac {
	public WebDriver driver;
	
    @Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://adactinhotelapp.com/");
       driver.manage().window().maximize(); 
	}
    
	@Parameters({"username","password"})
	@Test(expectedExceptions=NoSuchWindowException.class)
	public void username(String user, String pass) {
     WebElement data = driver.findElement(By.id("usernae"));
     data.sendKeys(user);
     WebElement data1 = driver.findElement(By.id("password"));
     data1.sendKeys(pass);
	}
   
	@Test
	public void click_Button()  {
    WebElement data2 = driver.findElement(By.id("login"));
    data2.click(); 
	}
}
