package com.actitime.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSetup {
	public static WebDriver driver;
	public String url="https://demo.actitime.com/login.do";
	@BeforeClass
	public void classsetup()
	{
		//firefox driver
		WebDriverManager.firefoxdriver().setup();
		
		//chromedriver
		//WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();	
	}
	
	@AfterClass
	public void classteardown()
	{
		driver.close();
	}

}
