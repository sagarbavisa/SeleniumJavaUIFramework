package com.tmb.tests;

import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;
import com.tmb.pages.OrangeHRMHomePage;
import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest

{
private OrangeHRMTests()
{
	
}
@Test
public void loginLogoutTest() throws InterruptedException
{
	OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
	OrangeHRMHomePage homePage = hrmLoginPage.inputUsername("Admin").inputPassword("admin123").clickLoginBtn();
	homePage.clickProfileLink().cliclLogoutLink();
}
}
