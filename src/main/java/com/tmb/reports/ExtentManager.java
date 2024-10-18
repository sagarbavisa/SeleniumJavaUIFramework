package com.tmb.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	private static ThreadLocal<ExtentTest> ext = new ThreadLocal<ExtentTest>();
private ExtentManager()
{
	
}
 static void setExtent(ExtentTest test)
{
	ext.set(test);
}
 public static ExtentTest getExtent()
{
	return ext.get();
}
static void unloadExtent()
{
	ext.remove();
}
}
