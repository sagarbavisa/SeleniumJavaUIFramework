package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;

public class BasePage 
{
protected BasePage()
{
	
}
protected void click(By by,WaitStrategy waitStrategy,String elementName) {
	
	WebElement element = ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.CLICKABLE, by);
			element.click();
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
