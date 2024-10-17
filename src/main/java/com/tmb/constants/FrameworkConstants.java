package com.tmb.constants;



import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtil;

public final class FrameworkConstants {
	private static final int EXPLICIT_TIME = 10;
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"extent-test-output/";
	private static String EXTENTREPORTFILEPATH="";
	private static final String EXCELPATH = RESOURCESPATH+"/excel/testdata.xlsx";
	private static final String RUNMANAGERSHEET = "RUNNER";
	private static final String ITERATIONDATASHEET = "DATA";
	
private FrameworkConstants()
{
	
}
public static int getExplicitWait()
{
	return EXPLICIT_TIME;
}
public static String getConfigPropertyFilePath()
{
	return CONFIGFILEPATH;
}
public static String getExtentReportFilePath() throws Exception
{
	if(EXTENTREPORTFILEPATH.isEmpty())
	{
		EXTENTREPORTFILEPATH = getExtentreportFolderPath();
	}
	return EXTENTREPORTFILEPATH;
}
private static String getExtentreportFolderPath() throws Exception {

	if(PropertyUtil.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no"))
	{
		return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
	}
	else
	{
	return EXTENTREPORTFOLDERPATH+"index.html";
	}
}
public static String getExcelpath() {
	return EXCELPATH;
}
public static String getResourcespath() {
	return RESOURCESPATH;
}
public static String getRunmanagersheet() {
	return RUNMANAGERSHEET;
}
public static String getIterationdatasheet() {
	return ITERATIONDATASHEET;
}

}
