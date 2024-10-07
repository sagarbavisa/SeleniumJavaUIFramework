package com.tmb.tests;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.XXHash32;
import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class DataProviderTest {

	@Test(dataProvider = "testData")
	public void testDataProvider(Map<String,String> map)
	{
		System.out.println(map.get("username"));
		
	}
	
	@DataProvider
	public Object[] testData() throws IOException
	{
		FileInputStream fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\dataPTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastColNum = sheet.getRow(0).getLastCellNum();
		Object[] data = new Object[lastRowNum];
		HashMap<String, String> map;
		for(int i=1;i<=lastRowNum;i++)
		{
			map = new HashMap<String, String>();
			for(int j=0;j<lastColNum;j++)
			{
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1] = map;
			}
		}
		return data;
	}
}
