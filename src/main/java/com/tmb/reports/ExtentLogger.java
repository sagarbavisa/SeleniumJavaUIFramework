package com.tmb.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.driver.DriverManager;
import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtil;
import com.tmb.utils.ScreenshotUtils;

public final class ExtentLogger {
private ExtentLogger()
{
	
}
public static void pass(String passMsg)
{
	ExtentManager.getExtent().pass(passMsg);
}
public static void fail(String failMsg)
{
	ExtentManager.getExtent().fail(failMsg);
}
public static void skip(String skipMsg)
{
	ExtentManager.getExtent().skip(skipMsg);
}
public static void pass(String passMsg,boolean isScreenshotNeeded)
{
	if(PropertyUtil.getValue(ConfigProperties.PASSEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && 
			isScreenshotNeeded)
	{
		ExtentManager.getExtent().pass(passMsg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	else {
		pass(passMsg);
	}
}
public static void fail(String failMsg,boolean isScreenshotNeeded)
{
	if(PropertyUtil.getValue(ConfigProperties.FAILEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && 
			isScreenshotNeeded)
	{
		ExtentManager.getExtent().fail(failMsg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	else {
		fail(failMsg);
	}
}
public static void skip(String skipMsg,boolean isScreenshotNeeded)
{
	if(PropertyUtil.getValue(ConfigProperties.SKIPPEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && 
			isScreenshotNeeded)
	{
		ExtentManager.getExtent().skip(skipMsg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	else {
		skip(skipMsg);
	}
}

}
