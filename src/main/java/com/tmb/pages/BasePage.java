package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;

public class BasePage 
{
protected BasePage()
{
	
}
protected void click(By by,WaitStrategy waitStrategy) {
	
	WebElement element = ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.CLICKABLE, by);
			element.click();
}
protected void sendText(By by,String text,WaitStrategy waitStrategy)
{
	WebElement element = ExplicitWaitFactory.PerformExplicitWait(WaitStrategy.VISIBLE, by);	
	element.sendKeys(text);
}
protected String getPageTitle()
{
	return DriverManager.getDriver().getTitle();
}

}
