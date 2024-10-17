package com.tmb.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.tmb.constants.FrameworkConstants;

public final class DataProviderUtils {
	private static List<Map<String, String>> dataSheetlist = new ArrayList<>();

	private DataProviderUtils() {

	}

	@DataProvider(parallel = true)
	public static Object[] getData(Method m) {
		String methodName = m.getName();
		if (dataSheetlist.isEmpty()) {
			dataSheetlist = ExcelUtils.getTestDetails(FrameworkConstants.getIterationdatasheet());
		}
		List<Map<String, String>> testMethodsList = new ArrayList<>();
		for (int i = 0; i < dataSheetlist.size(); i++) {
			if (dataSheetlist.get(i).get("testname").equalsIgnoreCase(methodName)
					&& dataSheetlist.get(i).get("execute").equalsIgnoreCase("yes")) {
				testMethodsList.add(dataSheetlist.get(i));
			}

		}
		return testMethodsList.toArray();
	}

}
