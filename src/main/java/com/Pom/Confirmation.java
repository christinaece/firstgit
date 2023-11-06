package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	
	static WebDriver driver;
	
	@FindBy (xpath="//input[@value='My Itinerary']")
	private WebElement Itinerary;

	public Confirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getItinerary() {
		return Itinerary;
	}

}
