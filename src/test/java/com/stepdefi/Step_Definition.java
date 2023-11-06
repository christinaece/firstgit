package com.stepdefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Pom.Page_Object_Manager;
import com.adactinPro.Adactin_Project.Base_Class;
import com.adactinrunner.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class{
	
	 Page_Object_Manager page=new Page_Object_Manager(driver);
	//public static WebDriver driver= Test_Runner.driver;
	
	//@Given("^to Launch The Website Url$")
	//public void to_launch_the_website_url() throws Throwable {
		//driver.get("https://adactinhotelapp.com/");
	    
	//}

	@Given("to Launch the Website Url")
	public void to_launch_the_website_url() {
		getUrl("https://adactinhotelapp.com/");
	}

	
	@Given("to enter the {string} in Username Field")
	public void to_enter_the_in_username_field(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("to enter the {string} in Password Field")
	public void to_enter_the_in_password_field(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	@Then("click login Button")
	public void click_login_button() {
		driver.findElement(By.name("login")).click();	    
	}
	//@When("^to Enter The Username$")
	//public void to_enter_the_username() throws Throwable {
		//driver.findElement(By.id("username")).sendKeys("minipriya");
	//}

	//@When("^to Enter The Password$")
	//public void to_enter_the_password() throws Throwable {
	//	driver.findElement(By.name("password")).sendKeys("mini09");
	//}

	//@Then("^Click Login Button$")
	//public void click_login_button() throws Throwable {
     //  driver.findElement(By.name("login")).click();	    
	//}

	@Given("to select Location")
	public void to_select_location() {
	//	WebElement data = driver.findElement(By.name("location"));
		//Select sc=new Select(data);
		//sc.selectByIndex(0);
      WebElement getlocation = page.getSa().getGetlocation();
      Base_Class.selectbyindex(getlocation, 1);
		}

	@Given("to select Hotels")
	public void to_select_hotels() {
	   //WebElement data1 = driver.findElement(By.name("hotels"));
		//Select sc=new Select(data1);
		//sc.selectByIndex(1);
		WebElement getHotels = page.getSa().getGetHotels();
		Base_Class.selectbyindex(getHotels, 2);

	}

	@Given("to select Room Type")
	public void to_select_room_type() {
	 //WebElement data2 = driver.findElement(By.name("room_type"));
	 //Select sc=new Select(data2);
		//sc.selectByIndex(1);
		WebElement getRoomType = page.getSa().getGetRoomType();
		Base_Class.selectbyindex(getRoomType, 1);
	}

	@Given("to select Number of Rooms")
	public void to_select_number_of_rooms() {
		//WebElement data3 = driver.findElement(By.name("room_nos"));
		 //Select sc=new Select(data3);
			//sc.selectByIndex(2);
		WebElement getNumber_Of_Rooms = page.getSa().getGetNumber_Of_Rooms();
		Base_Class.selectbyindex(getNumber_Of_Rooms, 2);

	}

	@Given("to select Check In Date")
	public void to_select_check_in_date() {
	   //WebElement CheckInDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   //CheckInDate.sendKeys("03/07/2023");
		WebElement check_In_Date = page.getSa().getCheck_In_Date();
		Base_Class.sendKeys(check_In_Date, "03/07/2023");
	}

	@Given("to select Check Out Date")
	public void to_select_check_out_date() {
	   // WebElement CheckOutDate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    //CheckOutDate.sendKeys("04/07/2023");
		WebElement check_Out_Date = page.getSa().getCheck_Out_Date();
		Base_Class.sendKeys(check_Out_Date, "04/07/2023");
	}

	@Given("to select Adults per Room")
	public void to_select_adults_per_room() {
	  // WebElement data4 = driver.findElement(By.id("adult_room"));
	   //Select sc=new Select(data4);
		//sc.selectByIndex(2);
		WebElement adults_Per_Room = page.getSa().getAdults_Per_Room();
		Base_Class.selectbyindex(adults_Per_Room, 2);
	}

	@Given("to select Children per Room")
	public void to_select_children_per_room() {
	 // WebElement data5 = driver.findElement(By.id("child_room"));
	  //Select sc=new Select(data5);
		//sc.selectByIndex(2);
		WebElement children_Per_Room = page.getSa().getChildren_Per_Room();
		Base_Class.selectbyindex(children_Per_Room, 2);
	}

	@Then("Click search Button")
	public void click_search_button() {
		//WebElement data6 = driver.findElement(By.name("Submit"));
		//data6.click();
		WebElement submit = page.getSa().getSubmit();
		Base_Class.click_Button(submit);
	}
	
	

}
