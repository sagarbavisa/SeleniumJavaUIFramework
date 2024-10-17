package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.AmazonHomePage;

public final class AmazonDemoTest extends BaseTest {
private AmazonDemoTest()
{
}
@Test
public void amazonTest(Map<String,String> data)
{
	String title = new AmazonHomePage().clickHamburger().clickComputers().clickSubMenuItem(data.get("menutext")).getTitle();
	Assertions.assertThat(title).isNotBlank();
}
}
