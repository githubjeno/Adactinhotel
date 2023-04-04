package com.runner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\ashin\\eclipse-workspace\\adactinhotelapp\\src\\test\\java\\com\\feature\\Booking_hotel.feature",
                  glue="com.stepdefinition",publish =true, dryRun = false,
                  plugin= {"pretty","html:target/adactinhotel.html",
                		   "json:target/adactinhotel.json",
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Testngrunner extends AbstractTestNGCucumberTests {
    @BeforeClass
	public static void browserlaunch() throws IOException {
    	
	  BaseClass.browserLaunch(File_Reader_Manager.getInstance().getbrowsername());
	  
  }
}
