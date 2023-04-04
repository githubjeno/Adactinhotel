package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_index 
{
	 public static WebDriver driver;
	 public POM_index(WebDriver driver2) {
			driver=driver2;
		   PageFactory.initElements(driver,this);
		}
	    
	    @FindBy(id="username")
	    private WebElement username;
	    
	    @FindBy(id="password")
	    private WebElement password;
	   
	    @FindBy(id="login")
	    private WebElement loginbutton;
   		

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}
}
