package com.tmb.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;

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
