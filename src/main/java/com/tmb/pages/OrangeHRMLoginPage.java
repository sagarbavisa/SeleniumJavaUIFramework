package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;
import com.tmb.reports.ExtentReport;

public final class OrangeHRMLoginPage extends BasePage {

	private final By username = By.cssSelector("input[name='username']");
	private final By password = By.xpath("//*[@type='password']");
	private final By loginBtn = By.cssSelector("button[type='submit']");
	
    
	public OrangeHRMLoginPage inputUsername(String usernameText)
	{
		sendText(username,usernameText,WaitStrategy.VISIBLE,"Username");
		return this;
	}
	public OrangeHRMLoginPage inputPassword(String passwordText)
	{
		sendText(password, passwordText,WaitStrategy.VISIBLE,"password");
		return this;
	}
	public OrangeHRMHomePage clickLoginBtn()
	{
		click(loginBtn,WaitStrategy.VISIBLE,"Login Button");
		return new OrangeHRMHomePage();
	}
}
