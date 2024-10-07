package com.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ISuiteListener,ITestListener{

	public void onTestStart(ITestResult result) {
		

		System.out.println("Method Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Method Ended successfully");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Method failed");
		
	}

	public void onStart(ISuite suite) {
		System.out.println("Before Suite");
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("After Suite");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
