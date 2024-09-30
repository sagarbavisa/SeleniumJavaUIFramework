package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private final By username = By.cssSelector("input[name='username']");
	private final By password = By.xpath("//*[@type='password']");
	private final By loginBtn = By.cssSelector("button[type='submit']");
	
    
	public OrangeHRMLoginPage inputUsername(String usernameText)
	{
		sendText(username,usernameText,WaitStrategy.VISIBLE);
		return this;
	}
	public OrangeHRMLoginPage inputPassword(String passwordText)
	{
		sendText(password, passwordText,WaitStrategy.VISIBLE);
		return this;
	}
	public OrangeHRMHomePage clickLoginBtn()
	{
		click(loginBtn,WaitStrategy.VISIBLE);
		return new OrangeHRMHomePage();
	}
}
