package com.actitime.commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	WebDriver driver;
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fisobj=new FileInputStream("./src/main/resources/LoginData/Logincreds.properties");
		Properties obj=new Properties();
		obj.load(fisobj);
		String value = obj.getProperty(key);
		return value;
		
		
	}
	

}
