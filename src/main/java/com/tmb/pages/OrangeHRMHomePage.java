package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMHomePage {
private final By profileLink = By.className("oxd-userdropdown-name");
private final By logoutLink = By.xpath("//*[text()='Logout']");
public OrangeHRMHomePage clickProfileLink() throws InterruptedException
{
	Thread.sleep(3000);
	DriverManager.getDriver().findElement(profileLink).click();
	return this;
}
public OrangeHRMHomePage cliclLogoutLink()
{
	DriverManager.getDriver().findElement(logoutLink).click();
	return this;
}
}
