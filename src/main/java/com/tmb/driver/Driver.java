package com.tmb.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.utils.ReadPropertyFile;

public class Driver {

	public static WebDriver driver;
	private Driver()
	{
		
	}

	public static void initdriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
			Thread.sleep(3000);
		}
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
