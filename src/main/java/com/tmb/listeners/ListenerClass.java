package com.tmb.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentReport;

public final  class ListenerClass  implements ISuiteListener,ITestListener{

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	}
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " is passed");
	}

	public void onTestFailure(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " is failed");
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	public void onStart(ISuite suite) {
		ExtentReport.initReports();
	}

	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReports();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
