package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.annotations.FrameworkAnnotations;
import com.tmb.enums.CategoryType;
import com.tmb.pages.AmazonHomePage;
import com.tmb.reports.ExtentManager;

public final class AmazonDemoTest extends BaseTest {
private AmazonDemoTest()
{
}
@FrameworkAnnotations(author = {"Sagar"},category = {CategoryType.SMOKE,CategoryType.REGRESSION})
@Test
public void amazonTest(Map<String,String> data)
{
	String title = new AmazonHomePage().clickHamburger().clickComputers().clickSubMenuItem(data.get("menutext")).getTitle();
	Assertions.assertThat(title).isNotBlank();
}
}
