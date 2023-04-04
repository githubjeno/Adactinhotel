package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_SearchHotel 
{ 
	public static WebDriver driver;
	public Pom_SearchHotel(WebDriver driver2)
	{
		driver= driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement locationSelect;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotelselect;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultsperroom;
	
	@FindBy(id="child_room")
	private WebElement childrenperroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement searchbutton;
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocationSelect() {
		//Select s = new Select(locationSelect);
		//s.selectByVisibleText("Paris");
		return locationSelect;
	}

	public WebElement getHotelselect() {
		//Select ss = new Select(hotelselect);
	//	ss.selectByVisibleText("Hotel Sunshine");
		
		return hotelselect;
	}

	public WebElement getRoomtype() {
		//Select sss = new Select(roomtype);
		//sss.selectByVisibleText("Standard");
		return roomtype;
	}

	public WebElement getNoofrooms() {
		//Select  ssss = new Select(noofrooms);
		//ssss.selectByValue("6");
		return noofrooms;
	}

	public WebElement getCheckindate() {
		//checkindate.sendKeys("25/12/2023");
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		//checkoutdate.sendKeys("01/01/2024");
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		//Select sssss = new Select(adultsperroom);
		//sssss.selectByValue("2");
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		//Select ssssss = new Select(childrenperroom);
		//ssssss.selectByValue("2");
		return childrenperroom;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}


	
	
  
}
