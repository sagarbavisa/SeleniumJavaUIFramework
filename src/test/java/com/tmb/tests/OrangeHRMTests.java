package com.tmb.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest

{
private OrangeHRMTests()
{
	
}
@Test
public void loginLogoutTest()
{
	OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
	String loginpageTitle = hrmLoginPage.inputUsername("Admin").inputPassword("admin123").clickLoginBtn()
			.clickProfileLink().clickLogoutLink().getTitle();
	
	Assertions.assertThat(loginpageTitle)
	.isEqualTo("OrangeHRM");
	
}
}
