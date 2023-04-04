package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_SelectHotel 
{
    public static WebDriver driver;
	
	
	public Pom_SelectHotel(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
	
	

}
