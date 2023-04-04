package com.stepdefinition;

import java.io.IOException;

import org.bouncycastle.crypto.engines.CramerShoupCiphertext;

import com.baseclass.BaseClass;
import com.helper.Configuration_Reader;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingTheHotel_steps extends BaseClass {
     
      
        
	Page_Object_Manager pom= new Page_Object_Manager(driver);
	
	@Given("when user launches the url")
	public void when_user_launches_the_url() throws IOException{
	   
	    
	    URL(File_Reader_Manager.getInstance().geturl());
	    
	}
	
	@When("user enters the valid username  and valid password")
	public void user_enters_the_valid_username_and_valid_password() throws IOException {
	    pom.getPindex().getUsername().sendKeys(File_Reader_Manager.getInstance().getvalidusername());
	    pom.getPindex().getPassword().sendKeys(File_Reader_Manager.getInstance().getvalidpassword());
	    
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    pom.getPindex().getLoginbutton().click();
	    
	}

	@When("user selects his location")
	public void user_selects_his_location() {
	    select_class(pom.getPSearchHotel().getLocationSelect(),"byvalue","Melbourne");
	    
	    
	}

	@When("selects the hotel")
	public void selects_the_hotel() {
	   select_class(pom.getPSearchHotel().getHotelselect(),"byvisibletext","Hotel Sunshine"); 
	    
	}

	@When("selects the room type")
	public void selects_the_room_type() {
	    
	    select_class(pom.getPSearchHotel().getRoomtype(),"byvalue","Standard");
	}

	@When("selects the required no of rooms")
	public void selects_the_required_no_of_rooms() {
	    select_class(pom.getPSearchHotel().getNoofrooms(),"byvalue","4");
	    
	}

	@When("selects his required checkin date")
	public void selects_his_required_checkin_date() {
		pom.getPSearchHotel().getCheckindate().clear();
	    pom.getPSearchHotel().getCheckindate().sendKeys("31/03/2023");
	    
	   
	}

	@When("selects his checkout date")
	public void selects_his_checkout_date() {
		 pom.getPSearchHotel().getCheckoutdate().clear();
		    pom.getPSearchHotel().getCheckoutdate().sendKeys("02/04/2023");
	    
	}

	@When("selects the no of adults per room")
	public void selects_the_no_of_adults_per_room() {
	    select_class( pom.getPSearchHotel().getAdultsperroom(),"byvalue","2");
	   
	}

	@When("selects the no of children per room")
	public void selects_the_no_of_children_per_room() {
	   select_class(pom.getPSearchHotel().getChildrenperroom(),"byvalue","2"); 
	    
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	    pom.getPSearchHotel().getSearchbutton().click();
	    
	}

	@Then("user is navigated to select hotel page")
	public void user_is_navigated_to_select_hotel_page() {
	    boolean contains = driver.getTitle().contains("Adactin.com - Select Hotel");
	    if(contains)
	    	System.out.println("the user is navigated to select hotel");
	    
	}

	@When("user selects hotel and clicks on continue button")
	public void user_selects_hotel_and_clicks_on_continue_button() throws InterruptedException {
	     Thread.sleep(3333);
		pom.getPSelectHotel().getRadiobutton().click();
		pom.getPSelectHotel().getContinuebutton().click();
	    
	}

	@When("user enters his first name and enters his lastname")
	public void user_enters_his_first_name_and_enters_his_lastname() {
	    
	    pom.getPBookHotel().getFirstname().sendKeys("noname");
	    pom.getPBookHotel().getSecondname().sendKeys("nosecondname");
	}

	@When("enters his billing address")
	public void enters_his_billing_address() {
	   pom.getPBookHotel().getAddress().sendKeys("sdkfjlkjdf,dfjkdjlkfjd, dflkjkldjsfaj"); 
	    
	}

	@When("enters his creadit card no")
	public void enters_his_creadit_card_no() {
	    pom.getPBookHotel().getCreditcardno().sendKeys("1234567890123456");
	    
	}

	@When("selects credit card type")
	public void selects_credit_card_type() {
		select_class(pom.getPBookHotel().getCreditcardtype(),"byvisibletext","VISA");
	    
	    
	}

	@When("selects the expiry date of credit card")
	public void selects_the_expiry_date_of_credit_card() {
		select_class(pom.getPBookHotel().getExpirymonth(),"byvisibletext","December");
		select_class(pom.getPBookHotel().getExpiryyear(),"byvisibletext","2022");
	    
	}

	@When("enters his cvv no")
	public void enters_his_cvv_no() {
	   pom.getPBookHotel().getCvvnumber().sendKeys("123"); 
	    
	}

	@When("clicks book now")
	public void clicks_book_now() {
	    pom.getPBookHotel().getBooknowbutton().click();
	    
	}

	@Then("the full details of roder is displayed user saves his order no for future reference")
	public void the_full_details_of_roder_is_displayed_user_saves_his_order_no_for_future_reference() throws InterruptedException {
	    Thread.sleep(3333);
	    System.out.print("The booking order no is :");
		System.out.print(pom.getPBookingConfirm().getOrderno().getAttribute("value"));  
	    
	}
}
