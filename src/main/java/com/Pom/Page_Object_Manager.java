package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinPro.Adactin_Project.Base_Class;


public class Page_Object_Manager{
	
	static WebDriver driver;
	
	private Home_Page_Adactin hp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Home_Page_Adactin getHp() {
		hp=new Home_Page_Adactin(driver);
		return hp;
	}

	//page2
	
	private Search_Adactin sa;
	
	public Search_Adactin getSa() {
		sa=new Search_Adactin(driver);
		return sa;
	}
	
	private Select_Hotel_Adactin selecthotel;
	
	public Select_Hotel_Adactin getselecthotel() {
		selecthotel=new Select_Hotel_Adactin(driver);
	return selecthotel;
	}
	
	private Book_Hotel_Adactin book;

	

	public Book_Hotel_Adactin getBook() {
		book=new Book_Hotel_Adactin(driver);
		return book;
	}
	
	private Confirmation con;

	public Confirmation getCon() {
		con=new Confirmation(driver);
		return con;
	}
	
	
	private Page_Logout log;

	public Page_Logout getLog() {
		log=new Page_Logout(driver);
		return log;
	}
	
	
}



