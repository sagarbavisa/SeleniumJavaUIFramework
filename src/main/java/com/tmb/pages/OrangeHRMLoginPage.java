package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMLoginPage {

	private final By username = By.cssSelector("input[name='username']");
	private final By password = By.xpath("//*[@type='password']");
	private final By loginBtn = By.cssSelector("button[type='submit']");
	
    
	public OrangeHRMLoginPage inputUsername(String usernameText)
	{
		DriverManager.getDriver().findElement(username).sendKeys(usernameText);
		return this;
	}
	public OrangeHRMLoginPage inputPassword(String passwordText)
	{
		DriverManager.getDriver().findElement(password).sendKeys(passwordText);
		return this;
	}
	public OrangeHRMHomePage clickLoginBtn()
	{
		DriverManager.getDriver().findElement(loginBtn).click();
		return new OrangeHRMHomePage();
	}
}
