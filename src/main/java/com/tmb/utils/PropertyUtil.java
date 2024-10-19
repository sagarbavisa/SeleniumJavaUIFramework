package com.tmb.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.tmb.constants.FrameworkConstants;
import com.tmb.enums.ConfigProperties;
import com.tmb.exceptions.PropertyFileUsageException;

public class PropertyUtil {
    private static Map<String, String> CONFIGMAP = new HashMap<>();
    private static Properties prop = new Properties();
    private PropertyUtil()
    {

    }

    static {
        try( FileInputStream fp = new FileInputStream(FrameworkConstants.getConfigPropertyFilePath());) {

            prop.load(fp);
            for (Map.Entry<Object, Object> propMap : prop.entrySet()) {
                CONFIGMAP.put(String.valueOf(propMap.getKey()).trim(), String.valueOf(propMap.getValue()).trim());
                System.out.print("key is " + propMap.getKey());
            }
        } catch (IOException e) {
            System.exit(0);
        }
    }

    public static String getValue(ConfigProperties key){
        if ( Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new PropertyFileUsageException("Property name " + key + " is not found. Please check");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }
}
