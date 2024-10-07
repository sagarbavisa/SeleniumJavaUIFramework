package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;
import com.tmb.reports.ExtentReport;

public final class OrangeHRMHomePage extends BasePage{
private final By profileLink = By.className("oxd-userdropdown-name");
private final By logoutLink = By.xpath("//*[text()='Logout']");
public OrangeHRMHomePage clickProfileLink()
{
	click(profileLink,WaitStrategy.CLICKABLE,"Proflie link");
	return this;  
}
public OrangeHRMHomePage clickLogoutLink()
{
	click(logoutLink,WaitStrategy.CLICKABLE,"Logout link");
	return this;
}
public String getTitle()
{
	return getPageTitle();
}
}
