package com.tmb.pages;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;
import com.tmb.reports.ExtentLogger;

public class BasePage {
    protected BasePage() {

    }

    protected void click(By by, WaitStrategy waitStrategy, String elementName) {

        WebElement element = ExplicitWaitFactory.PerformExplicitWait(waitStrategy, by);
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed");
        element.click();
        ExtentLogger.pass(elementName + " is clicked", true);

    }

    protected void sendText(By by, String value, WaitStrategy waitStrategy, String elementName) {
        WebElement element = ExplicitWaitFactory.PerformExplicitWait(waitStrategy, by);
        element.sendKeys(value);
        ExtentLogger.pass(value + " is entered successfully in " + elementName, true);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
    protected void scrollToElement(By by,WaitStrategy waitStrategy)
    {
        WebElement element = ExplicitWaitFactory.PerformExplicitWait(waitStrategy, by);
        ((JavascriptExecutor) DriverManager.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
