package com.tmb.pages;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;
import com.tmb.reports.ExtentLogger;

public class BasePage 
{
protected BasePage()
{
	
}
protected void click(By by,WaitStrategy waitStrategy,String elementName) {
	
	WebElement element = ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.FLUENT_WAIT, by);
	Assert.assertTrue(element.isDisplayed(),"Element is not displayed");
			if(Objects.nonNull(element))
			{
			element.click();
			}
			else {
				WebElement element2 =	ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.FLUENT_WAIT, by);
				element2.click();
			}
		try {
			ExtentLogger.pass(elementName + " is clicked",true);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
protected void sendText(By by,String value,WaitStrategy waitStrategy,String elementName)
{
	WebElement element = ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.VISIBLE, by);	
	element.sendKeys(value);
	try {
		ExtentLogger.pass(value + " is entered successfully in "+elementName,true);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
protected String getPageTitle()
{
	return DriverManager.getDriver().getTitle();
}

}
