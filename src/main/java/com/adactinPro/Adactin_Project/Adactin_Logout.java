package com.adactinPro.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adactin_Logout {
	
	static WebDriver driver;
	
	@FindBy(name="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
