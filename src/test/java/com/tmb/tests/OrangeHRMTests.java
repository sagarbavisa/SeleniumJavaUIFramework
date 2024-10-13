package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;
import com.tmb.reports.ExtentReport;
import com.tmb.utils.DataProviderUtils;
public final class OrangeHRMTests extends BaseTest

{
	private OrangeHRMTests()
	{
			
	}
	@Test(dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
	public void loginLogoutTest(Map<String, String> data)
	{
		OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
		String loginpageTitle = hrmLoginPage.inputUsername(data.get("username")).inputPassword(data.get("password")).clickLoginBtn()
				.clickProfileLink().clickLogoutLink().getTitle();

		Assertions.assertThat(loginpageTitle)
		.isEqualTo("OrangeHRM");

	}
	
	@Test(dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
	public void newTest(Map<String, String> data)
	{
		
		OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
		String loginpageTitle = hrmLoginPage.inputUsername(data.get("username")).inputPassword(data.get("password")).clickLoginBtn()
				.clickProfileLink().clickLogoutLink().getTitle();

		Assertions.assertThat(loginpageTitle)
		.isEqualTo("OrangeHRM");

	}
	
	
}
