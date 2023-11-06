package com.TestngAdac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pom.Confirmation;

public class Adac_Testng {
		
	   static WebDriver driver;
	   
		@BeforeSuite
		public void login() {
		   System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
		}
	
		
		@BeforeTest
		public void sendKeys() {
			driver.findElement(By.id("username")).sendKeys("minipriya");
			driver.findElement(By.name("password")).sendKeys("mini09");
			driver.findElement(By.name("login")).click();
		}
		
		@BeforeClass(timeOut=3000)
        public void search_Hotel() {
            WebElement element = driver.findElement(By.name("location"));  
		Select sel=new Select(element);
         sel.selectByVisibleText("Sydney");
         WebElement element1 = driver.findElement(By.id("hotels"));
         Select sel1=new Select(element1);
         sel1.selectByIndex(1);
         WebElement element3 = driver.findElement(By.id("room_type"));
         Select sel2=new Select(element3);
         sel2.selectByIndex(2);
         WebElement element4 = driver.findElement(By.id("room_nos"));
         Select sel3=new Select(element4);
         sel3.selectByIndex(4);
         WebElement element5 = driver.findElement(By.name("datepick_in"));
         element5.sendKeys("01/11/2023");
         WebElement element6 = driver.findElement(By.name("datepick_out"));
         element6.sendKeys("03/11/2023");
         WebElement element7 = driver.findElement(By.id("adult_room"));
         Select sel4=new Select(element7);
         sel4.selectByValue("2");
         WebElement element8 = driver.findElement(By.id("child_room"));
         Select sel5=new Select(element8);
         sel5.selectByIndex(3);
         driver.findElement(By.name("Submit")).click();
         
}		
		@Test
	public void sel_Hotel() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.name("continue")).click();
	}	
		@AfterMethod
		public void book_Hotel() {
			driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Christina");
			driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Joys");
			driver.findElement(By.name("address")).sendKeys("Chicago");
			driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("1234567890123456");
			WebElement ele = driver.findElement(By.name("cc_type"));
			Select sel=new Select(ele);
			sel.selectByIndex(2);
			WebElement ele1 = driver.findElement(By.id("cc_exp_month"));
			Select sel1=new Select(ele1);
			sel1.selectByIndex(3);
			WebElement ele2 = driver.findElement(By.id("cc_exp_year"));
			Select sel2=new Select(ele2);
			sel2.selectByIndex(8);
			driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("456");
			driver.findElement(By.xpath("//input[@value='Book Now']")).click();
		}
		@AfterTest
       public void Confirmation() {	
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
}
		@Test(enabled=false)
		 public void Confirmation_Prac() {	
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		}
		@AfterSuite
		public void logout() {
       driver.findElement(By.id("logout")).click();
		}
		
		
}
