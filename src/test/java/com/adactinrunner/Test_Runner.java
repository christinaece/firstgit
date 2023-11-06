package com.adactinrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactinPro.Adactin_Project.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src//test//java//com//featurefile//",
        glue="com.stepdefi")
        //plugin= {"html:HtmlReport/Adactin Hotel Login Page",
        		//"pretty",
        	//	"json:JsonReport/Adactin Hotel Login Page"
        //}
        

public class Test_Runner extends Base_Class {
	
	
	@BeforeClass
	public static void setup()  {
		
		 browser_Launch();
				
		}
	
	@AfterClass
	public static void tear_Down(){
		driver.quit();

		
	}
}

