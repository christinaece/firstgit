package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Adactin {

		static WebDriver driver;     
	    
		public Search_Adactin(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}

		public WebElement getGetlocation() {
			return getlocation;
		}

		public WebElement getGetHotels() {
			return getHotels;
		}

		public WebElement getGetRoomType() {
			return getRoomType;
		}

		public WebElement getGetNumber_Of_Rooms() {
			return getNumber_Of_Rooms;
		}

		public WebElement getCheck_In_Date() {
			return check_In_Date;
		}

		public WebElement getCheck_Out_Date() {
			return check_Out_Date;
		}

		public WebElement getAdults_Per_Room() {
			return adults_Per_Room;
		}

		public WebElement getChildren_Per_Room() {
			return children_Per_Room;
		}

		public WebElement getSubmit() {
			return submit;
		}

		@FindBy(name="location")
	    private WebElement getlocation;

		@FindBy(id="hotels")
	    private WebElement getHotels;

		@FindBy(id="room_type")	
	    private WebElement getRoomType;

		
		@FindBy(id="room_nos")
	    private WebElement getNumber_Of_Rooms;

		
		@FindBy(name="datepick_in")
		private WebElement check_In_Date;
		
		
		@FindBy(name="datepick_out")
		private WebElement check_Out_Date;

		@FindBy(id="adult_room")
		private WebElement adults_Per_Room;
		
		@FindBy(id="child_room")
		private WebElement children_Per_Room;

		@FindBy(name="Submit")
		private WebElement submit;
		
		}
		
		

