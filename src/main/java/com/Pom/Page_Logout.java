package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Logout {
	
	static WebDriver driver;
	
	@FindBy(name="logout")
	private WebElement logout;

	public Page_Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
