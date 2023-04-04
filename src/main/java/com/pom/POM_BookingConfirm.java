package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_BookingConfirm {
    public static WebDriver driver;
    public POM_BookingConfirm(WebDriver driver1)
	{
	  driver=driver1;
	  PageFactory.initElements(driver, this);
	}
    
    @FindBy(xpath="//input[@name='order_no']")
    private WebElement orderno;
	
    
  

	public WebElement getOrderno() {
		
		return orderno;
	}
    
    
	

}
