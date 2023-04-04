package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	public static WebDriver driver;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	private  POM_BookHotel PBookHotel ;
	private POM_BookingConfirm PBookingConfirm;
	private POM_index Pindex;
	private Pom_SearchHotel PSearchHotel;
	private Pom_SelectHotel PSelectHotel;
	
	


	public POM_BookHotel getPBookHotel() {
		PBookHotel = new  POM_BookHotel(driver);
		return PBookHotel;
	}

	public POM_BookingConfirm getPBookingConfirm() {
		PBookingConfirm = new POM_BookingConfirm(driver);
		return PBookingConfirm;
	}

	public POM_index getPindex() {
		Pindex= new POM_index(driver);
		return Pindex;
	}

	public Pom_SearchHotel getPSearchHotel() {
		PSearchHotel = new Pom_SearchHotel(driver);
		return PSearchHotel;
	}

	public Pom_SelectHotel getPSelectHotel() {
		PSelectHotel = new Pom_SelectHotel(driver);
		return PSelectHotel;
	}

	
	
	
}
