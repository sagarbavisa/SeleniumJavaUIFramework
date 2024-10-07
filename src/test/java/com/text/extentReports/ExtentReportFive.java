package com.text.extentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportFive {
	@Test
	public void extentTest() throws IOException
	{
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/index.html");
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("Automation Report");
	spark.config().setReportName("Extent Reports Demo");
	extent.attachReporter(spark);
	
	ExtentTest test = extent.createTest("Login Test");
	test.pass("Login Test started successfully");
	test.info("URL is loaded");
	test.info("Values entered");
	test.pass("Login Test completed successfully");
	
	ExtentTest test1 = extent.createTest("HomePage Test");
	test1.pass("HomePage Test started successfully");
	test1.info("URL is loaded");
	test1.info("Values entered");
	test1.fail("HomePage test failed");
	extent.flush();
	Desktop.getDesktop().browse(new File("target/index.html").toURI());
	}
}
