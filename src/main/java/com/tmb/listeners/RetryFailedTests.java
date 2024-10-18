package com.tmb.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtil;

public final class RetryFailedTests implements IRetryAnalyzer{
	private int retries = 1;
	private int count = 0;
	@Override
	public boolean retry(ITestResult result) {
		boolean value = count<retries;
		try {
			if(PropertyUtil.getValue(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
			{
			count++;
			}
			else {
				value = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	

}
