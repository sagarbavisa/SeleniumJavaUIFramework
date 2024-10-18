package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public final class AmazonHomePage extends BasePage{
	private String hamburgerId = "//*[@id='nav-hamburger-menu']";
	
	public AmazonHamburgerMenuPage clickHamburger()
	{
		click(By.xpath(hamburgerId),WaitStrategy.CLICKABLE,"Hamburger menu");
		return new AmazonHamburgerMenuPage();
	}
}
