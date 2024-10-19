package com.tmb.listeners;

import com.tmb.exceptions.PropertyFileUsageException;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtil;

public final class RetryFailedTests implements IRetryAnalyzer{
    private int count = 0;
	@Override
	public boolean retry(ITestResult result) {
        int retries = 1;
        boolean value = count< retries;
			if(PropertyUtil.getValue(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
			{
			count++;
			}
			else {
				value = false;
			}
			return value;
	}
	

}
