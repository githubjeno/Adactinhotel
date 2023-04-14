package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class Configuration_Reader {
	public static Properties prop;

	public Configuration_Reader() throws IOException {
		prop = new Properties();

		File f = new File(
				"C:\\Users\\ashin\\eclipse-workspace\\adactinhotelapp\\src\\test\\java\\com\\helper\\adactinhotelapp.properties");

		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);

	}

	public  String getbrowsername() {
	    String browsername = prop.getProperty("browser");
		return browsername;
	}
	public  String geturl() {
		String url = prop.getProperty("url");
		return url;
	}
	public  String getvalidusername() {
		String validusername = prop.getProperty("validusername");
		return validusername;
	}
	public  String getvalidpassword() {
		String validpassword = prop.getProperty("validpassword");
		return validpassword;
	}
	
	
}
