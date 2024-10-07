package com.tmb.reports;

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
}
