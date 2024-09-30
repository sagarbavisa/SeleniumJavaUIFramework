package com.tmb.tests;



import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class DataProviderTest {

	@Test(dataProvider = "testData")
	public void testDataProvider(Object[] obj)
	{
		System.out.println("Username");
	}
	
	
}
