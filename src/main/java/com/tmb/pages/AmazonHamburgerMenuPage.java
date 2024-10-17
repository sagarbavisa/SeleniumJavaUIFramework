package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.DynamicXPathUtils;

public final class AmazonHamburgerMenuPage extends BasePage{
	private String linkComputers = "//div[text()='Mobiles, Computers']/parent::a";
private String linkSubMenu = "//a[text()='%s']";
public AmazonLaptopPage clickSubMenuItem(String menuText)
{
	click(By.xpath(DynamicXPathUtils.getXpath(linkSubMenu,menuText)),WaitStrategy.CLICKABLE,menuText);
	if(menuText.equalsIgnoreCase("Laptops"))
	{
		return new AmazonLaptopPage();
	}
	return null;
}
public AmazonHamburgerMenuPage clickComputers()
{
	
	click(By.xpath(linkComputers),WaitStrategy.VISIBLE,"Mobiles,Computers");
	return this;
	
}
}
