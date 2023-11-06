package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Adactin {

static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement select_Hotel;
	
	@FindBy(name="continue")
	private WebElement select_Continue;

	public Select_Hotel_Adactin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelect_Hotel() {
		return select_Hotel;
	}

	public WebElement getSelect_Continue() {
		return select_Continue;
	}
	
	
}


