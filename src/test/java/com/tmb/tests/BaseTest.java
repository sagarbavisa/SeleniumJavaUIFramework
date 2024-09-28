package com.tmb.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;

public class BaseTest 
{
	
	
	protected BaseTest()
	{
		
	}
	@BeforeMethod
	protected void setUp() throws Exception
	{
		Driver.initdriver();
	}
	@AfterMethod
	protected void tearDown()
	{
		Driver.quitDriver();
	}
}
