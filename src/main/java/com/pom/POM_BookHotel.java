package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_BookHotel
{
     public static WebDriver driver;
	public POM_BookHotel(WebDriver driver1) {
		
	driver=driver1;
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement secondname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditcardno;
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement booknowbutton;
	
	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		//Select  s1 = new Select(creditcardtype);
		//s1.selectByVisibleText("VISA");
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		//Select s2 = new Select(expirymonth);
		//s2.selectByVisibleText("October");
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		//Select s4 = new Select(expiryyear);
	    // s4.selectByVisibleText("2012");
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	
	public WebElement getBooknowbutton() {
		return booknowbutton;
	}

	
	
	
	
	
	
	
	
	
   
}
