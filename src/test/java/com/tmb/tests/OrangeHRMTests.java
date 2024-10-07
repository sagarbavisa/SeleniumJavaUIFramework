package com.tmb.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;
import com.tmb.reports.ExtentReport;
public final class OrangeHRMTests extends BaseTest

{
	private OrangeHRMTests()
	{

	}
	@Test(dataProvider = "LoginDataProvideTest")
	public void loginLogoutTest(String username,String password)
	{
		
		OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
		String loginpageTitle = hrmLoginPage.inputUsername(username).inputPassword(password).clickLoginBtn()
				.clickProfileLink().clickLogoutLink().getTitle();

		Assertions.assertThat(loginpageTitle)
		.isEqualTo("OrangeHRM");

	}
	@DataProvider(name="LoginDataProvideTest" , parallel = true)
	public Object[][] loginTestData()
	{
		return new Object[][]
				{
			{"Admin","admin123"},
			{"Admin23","admin123"},
			{"Admin","admin123"},
			{"Admin","admin1234"},
				};
	}
}
