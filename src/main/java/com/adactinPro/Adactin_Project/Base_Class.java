package com.adactinPro.Adactin_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	 public static WebDriver driver;  
	  public static Actions actions;
	  public static Select sel;
	  public static Robot robo;
	  
	  
	public static WebDriver browser_Launch() {//To Launch the browser
    
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Chrome\\chromedriver.exe");
      return driver=new ChromeDriver();
}
	
	public static void maximize() {
   driver.manage().window().maximize();
	}
	public static void getUrl(String url) {    //get url
    driver.get(url);
	}
	public static void sendKeys(WebElement element, String value) {  //Sendkeys
		element.sendKeys(value);
	}
	public static void click_Button(WebElement element) {  //click
         element.click();   
	}
	
	//Alert
	
	public static void accept_Alert() {
		driver.switchTo().alert().accept();
	}
	public static void dismiss_Alert() {
		driver.switchTo().alert().dismiss();
	}
	public static void getText_Alert() {
       driver.switchTo().alert().getText();
	}
	
	//Actions

	
	 public static void actions_Click(WebElement element) {
		    actions=new Actions(driver);    
     actions.click(element).build().perform();
	}
	 public static void actions_ContextClick(WebElement element) {
		    actions=new Actions(driver);    
		 actions.contextClick(element).build().perform();
	}
	public static void actions_DoubleClick(WebElement element) {
	    actions=new Actions(driver);    
    actions.doubleClick(element).build().perform();
	}
	public static void actions_MoveToElement(WebElement element) {
	    actions=new Actions(driver);    
    actions.moveToElement(element).build().perform();
	}
	public static void actions_DragAndDrop(WebElement source, WebElement target) {
	    actions=new Actions(driver);    
    actions.dragAndDrop(source, target).build().perform();
	}
	
	//Frames
	public static  void switchto_Frames(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	public static void switchto_FrameNameOrID(String FrameNameOrID) {
		driver.switchTo().frame(FrameNameOrID);
	}
	public static void switchto_DefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	//Single DropDown
	
	
	public static void selectbyvalue(WebElement select,String value) {
	     Select sel=new Select(select);
        sel.selectByValue(value);
	}
	public static void selectbyindex(WebElement select,int index) {
	     Select sel=new Select(select);
		sel.selectByIndex(index);
	}
	public static void selectbyvisibletext(WebElement select,String text) {
	     Select sel=new Select(select);
        sel.selectByVisibleText(text);
	}
	public static void getselectedoptions(WebElement select) {
	     Select sel=new Select(select);
		sel.getOptions();
	}
	
	//Multiple DropDown

	public static void muti_Dropdown(WebElement element,int index1, int index2) {
	     Select sel=new Select(element);
         sel.selectByIndex(index1);
         sel.selectByIndex(index2);
	}
	
	//Robot
	
	public static void robotHandler() throws AWTException {
     robo=new Robot();
	}
	public static void press_Key(int keyCode) {
     robo.keyPress(keyCode);
	}
	public static void release_Key(int keyCode) {
	     robo.keyRelease(keyCode);
	}
	
	//TakeScreeShot
	
	
	public static void screenShot(String name) throws IOException, InterruptedException { //Indicating the exception since we have given input and ourput

	 TakesScreenshot ts=(TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
  File destination = new File("C:\\Users\\Christina\\eclipse-workspace\\Adactin_Project\\Screenshot\\"+name+". png");
   FileUtils.copyFile(source, destination);
   
   Thread.sleep(7000);
	}
	

    
//Scroll to the bottom of the website:

public static void scrollTo_BottomOfWebsite() throws InterruptedException {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(3000);
    js.executeScript("window.scrollBy(0, 500);");
}

//window handle

public static void window_Handles(WebElement element) {

      String windowHandle = driver.getWindowHandle();
      element.click();
      
      Set<String> windowHandles = driver.getWindowHandles();
for (String handler : windowHandles) {
	driver.switchTo().window(handler);
}

}}










		
	
	


