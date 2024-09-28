package com.tmb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile 
{
	private static Map<String, String> CONFIGMAP = new HashMap<String, String>();
	private static Properties prop = new Properties();
	static {
		try {
			FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\config.properties");
			prop.load(fp);
			for(Map.Entry<Object, Object> propMap : prop.entrySet())
			{
				CONFIGMAP.put(String.valueOf(propMap.getKey()).trim(), String.valueOf(propMap.getValue()).trim());
				System.out.print("key is "+propMap.getKey());
			}
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
public static String getValue(String key) throws Exception
{
	if(Objects.isNull(CONFIGMAP.get(key)) || Objects.isNull(key))
	{
	throw new Exception("Property name "+key+" is not found. Please check");	
	}
	return CONFIGMAP.get(key);
	}
}
