package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Adactin {

static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
    private WebElement first_Name;

	@FindBy(xpath="(//input[@type='text'])[12]")
    private WebElement last_Name;

	@FindBy(name="address")
    private WebElement billing_Address;

	@FindBy(xpath="(//input[@type='text'])[13]")
    private WebElement credit_Card_No;

	@FindBy(name="cc_type")
    private WebElement credit_Card_Type;

	@FindBy(id="cc_exp_month")
  private WebElement expiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryDate1;

	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement cVV_Number;

	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement booknow;

	public Book_Hotel_Adactin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCredit_Card_No() {
		return credit_Card_No;
	}

	public WebElement getCredit_Card_Type() {
		return credit_Card_Type;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryDate1() {
		return expiryDate1;
	}

	public WebElement getcVV_Number() {
		return cVV_Number;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}


