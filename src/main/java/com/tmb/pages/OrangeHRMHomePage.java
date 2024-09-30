package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage{
private final By profileLink = By.className("oxd-userdropdown-name");
private final By logoutLink = By.xpath("//*[text()='Logout']");
public OrangeHRMHomePage clickProfileLink()
{
	click(profileLink,WaitStrategy.CLICKABLE);
	return this;
}
public OrangeHRMHomePage clickLogoutLink()
{
	click(logoutLink,WaitStrategy.CLICKABLE);
	return this;
}
public String getTitle()
{
	return getPageTitle();
}
}
