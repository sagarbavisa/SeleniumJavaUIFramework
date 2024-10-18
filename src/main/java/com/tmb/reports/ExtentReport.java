package com.tmb.reports;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tmb.constants.FrameworkConstants;

public final class ExtentReport {
	private static ExtentReports extent;
	private ExtentReport()
	{
		
	}
	public static void initReports() throws Exception
	{
		if(Objects.isNull(extent))
		{
	    extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Reports Demo");
		extent.attachReporter(spark);
		}
	}
	public static void flushReports()
	{
		if(Objects.nonNull(extent))
		{
		extent.flush();
		}
		ExtentManager.unloadExtent();
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void createTest(String testcaseName)
	{
		ExtentManager.setExtent(extent.createTest(testcaseName));
	}
	public static void addAuthors(String[] authors)
	{
		for(String name : authors)
		{
		ExtentManager.getExtent().assignAuthor(name);
		}
	}
	public static void addCategories(String[] categories)
	{
		for(String category : categories)
		{
			ExtentManager.getExtent().assignCategory(category);
		}
	}
}
