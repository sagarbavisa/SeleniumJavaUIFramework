package com.tmb.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public final class DataProviderUtils {
	private static List<Map<String, String>>  dataSheetlist = new ArrayList<>();
	private DataProviderUtils()
	{
		
	}
	@DataProvider
	public static Object[] getData(Method m)
	{
		String methodName = m.getName();
		if(dataSheetlist.isEmpty())
		{
		dataSheetlist =	ExcelUtils.getTestDetails("DATA");
		}
	List<Map<String, String>> testMethodsList = new ArrayList<>();
	for(int i=0;i<dataSheetlist.size();i++)
	{
		if(dataSheetlist.get(i).get("testname").equalsIgnoreCase(methodName))
		{
			if(dataSheetlist.get(i).get("execute").equalsIgnoreCase("yes"))
			{
				testMethodsList.add(dataSheetlist.get(i));
			}
		}
	}
	dataSheetlist.removeAll(testMethodsList);
	return testMethodsList.toArray();
	}

}
