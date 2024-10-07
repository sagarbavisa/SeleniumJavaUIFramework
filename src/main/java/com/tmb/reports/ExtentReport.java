package com.tmb.reports;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	private static ExtentReports extent;
	private ExtentReport()
	{
		
	}
	public static void initReports()
	{
		if(Objects.isNull(extent))
		{
	    extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Reports Demo");
		extent.attachReporter(spark);
		}
	}
	public static void flushReports() throws IOException
	{
		if(Objects.nonNull(extent))
		{
		extent.flush();
		}
		Desktop.getDesktop().browse(new File("target/index.html").toURI());
	}
	public static void createTest(String testcaseName)
	{
		ExtentManager.setExtent(extent.createTest(testcaseName));
	}
}
