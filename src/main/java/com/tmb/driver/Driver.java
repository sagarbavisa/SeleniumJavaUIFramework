package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtil;

public class Driver {

	public static WebDriver driver;
	private Driver()
	{
		
	}

	public static void initdriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtil.getValue(ConfigProperties.URL));
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
