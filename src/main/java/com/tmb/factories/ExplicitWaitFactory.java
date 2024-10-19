package com.tmb.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;


public final class ExplicitWaitFactory {
	private ExplicitWaitFactory()
	{
	}
		public static WebElement PerformExplicitWait(WaitStrategy waitStrategy,By by)
	{
			WebElement element = null;
		if(waitStrategy == WaitStrategy.VISIBLE)
		{
		element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
		.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if (waitStrategy == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if (waitStrategy == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if (waitStrategy == WaitStrategy.NONE) {
			element = DriverManager.getDriver().findElement(by);
		}
		else if(waitStrategy == WaitStrategy.FLUENT_WAIT)
		{
		element =	new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(Exception.class)
            .until(driver->DriverManager.getDriver().findElement(by));
		}
		return element;
	}
	

}
