package com.tapdata.apidemo.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * get properties from resource file
 */
@Slf4j
public class PropertiesUtils {

    private static final String defaultResource = "ApplicationResources";

    /**
     * get property value from ApplicationResources.properties
     *
     * @param key
     *            key of properties
     * @return value of the key
     */
    public static String getProperty(String key) {
        return getProperty(key, defaultResource);
    }

    /**
     * get property value from properties file
     *
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return value of the key
     */
    public static String getProperty(String key, String resource) {
        ResourceBundle boudle = null;

        try {
            boudle = ResourceBundle.getBundle(resource);
        } catch (MissingResourceException e) {
            log.warn("can not find bundled resource: " + resource);
            return null;
        }

        try {
            return boudle.getString(key);
        } catch (MissingResourceException e) {
            log.warn("can not find bundled resource key: " + key);
            return null;
        }
    }

    /**
     * @function get boolean property value from properties file.
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return the boolean value(if the key can't be found, return 'false' instead)
     *
     * @author Zhao Zhihong
     */
    public static boolean getBooleanProperty(String key, String resource) {
        String value = getProperty(key, resource);
        return value == null ? false : Boolean.valueOf(value);
    }

    /**
     * @function get int property value from properties file.
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return the int value(if the key can't be found, return '0' instead)
     *
     * @author Zhao Zhihong
     */
    public static int getIntProperty(String key, String resource) {
        String value = getProperty(key, resource);
        return value == null ? 0 : Integer.valueOf(value);
    }

    /**
     * @function get long property value from properties file.
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return the long value(if the key can't be found, return '0' instead)
     *
     * @author Zhao Zhihong
     */
    public static long getLongProperty(String key, String resource) {
        String value = getProperty(key, resource);
        return value == null ? 0 : Long.valueOf(value);
    }

    /**
     * @function get double property value from properties file.
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return the double value(if the key can't be found, return '0' instead)
     *
     * @author Zhao Zhihong
     */
    public static double getDoubleProperty(String key, String resource) {
        String value = getProperty(key, resource);
        return value == null ? 0d : Double.valueOf(value);
    }

    /**
     * @function get float property value from properties file.
     * @param key
     *            key of properties
     * @param resource
     *            properties file name (without file extension name .properties)
     * @return the float value(if the key can't be found, return '0' instead)
     *
     * @author Zhao Zhihong
     */
    public static float getFloatProperty(String key, String resource) {
        String value = getProperty(key, resource);
        return value == null ? 0f : Float.valueOf(value);
    }
}