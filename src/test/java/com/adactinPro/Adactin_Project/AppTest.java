package com.adactinPro.Adactin_Project;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pom.Page_Object_Manager;

public class AppTest{
    
	
	static WebDriver driver=Base_Class.browser_Launch();
	public static Page_Object_Manager page=new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException {
		
		//Page 1
		
		Base_Class.maximize();
		Base_Class.getUrl("https://adactinhotelapp.com/");
		WebElement Data = page.getHp().getUsername();
		Base_Class.sendKeys(Data, "minipriya");
		WebElement Data1 = page.getHp().getPassword();
		Base_Class.sendKeys(Data1, "mini09");
		WebElement Data2 = page.getHp().getLogin();
		Base_Class.click_Button(Data2);
		
		//Page2
		WebElement getlocation = page.getSa().getGetlocation();
		Base_Class.selectbyindex(getlocation, 2);
		WebElement getHotels = page.getSa().getGetHotels();
		Base_Class.selectbyindex(getHotels, 2);
		WebElement getRoomType = page.getSa().getGetRoomType();
		Base_Class.selectbyvalue(getRoomType, "Double");
		WebElement getNumber_Of_Rooms = page.getSa().getGetNumber_Of_Rooms();
		Base_Class.selectbyindex(getNumber_Of_Rooms, 7);
		Thread.sleep(3000);
		WebElement check_In_Date = page.getSa().getCheck_In_Date();
		Base_Class.sendKeys(check_In_Date, "01/11/2023"); 
        WebElement check_Out_Date = page.getSa().getCheck_Out_Date();
        Base_Class.sendKeys(check_Out_Date, "03/11/2023");
        WebElement adults_Per_Room = page.getSa().getAdults_Per_Room();
        Base_Class.selectbyindex(adults_Per_Room, 3);
        WebElement children_Per_Room = page.getSa().getChildren_Per_Room();
        Base_Class.selectbyindex(children_Per_Room, 4);
        WebElement submit = page.getSa().getSubmit();
        Base_Class.click_Button(submit);
        
        //page 3
        
        WebElement select_Hotel = page.getselecthotel().getSelect_Hotel();
        Base_Class.click_Button(select_Hotel);
        WebElement select_Continue = page.getselecthotel().getSelect_Continue();
        Base_Class.click_Button(select_Continue);
        
        //page 4
        
        WebElement first_Name = page.getBook().getFirst_Name();
        Base_Class.sendKeys(first_Name, "Christina");
        WebElement last_Name = page.getBook().getLast_Name();
        Base_Class.sendKeys(last_Name, "Joys");
        WebElement billing_Address = page.getBook().getBilling_Address();
        Base_Class.sendKeys(billing_Address, "Chicago");
        WebElement credit_Card_No = page.getBook().getCredit_Card_No();
        Base_Class.sendKeys(credit_Card_No, "1234567890123456");
        WebElement credit_Card_Type = page.getBook().getCredit_Card_Type();
        
        Base_Class.selectbyindex(credit_Card_Type, 2);
        WebElement expiryDate = page.getBook().getExpiryDate();
        Base_Class.selectbyindex(expiryDate, 3);
        WebElement expiryDate1 = page.getBook().getExpiryDate1();
        Base_Class.selectbyindex(expiryDate1, 8);
        WebElement getcVV_Number = page.getBook().getcVV_Number();
        Base_Class.sendKeys(getcVV_Number, "456");
        WebElement booknow = page.getBook().getBooknow();
        Base_Class.click_Button(booknow);
        
        
        //page 5
         WebElement itinerary = page.getCon().getItinerary();
         Thread.sleep(6000);
         Base_Class.actions_MoveToElement(itinerary);
         Base_Class.actions_Click(itinerary);
         	

	//page 6
	 
         WebElement logout = page.getLog().getLogout();
         Thread.sleep(6000);
         Base_Class.actions_MoveToElement(logout);
         Base_Class.actions_Click(logout);
	}
}
