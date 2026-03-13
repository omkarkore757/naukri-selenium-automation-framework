package com.naukri.framework.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

private static Properties prop;

// Load config file
public static Properties loadConfig() {

    try {

        prop = new Properties();

        FileInputStream fis = new FileInputStream(
                "src/test/resources/config.properties");

        prop.load(fis);

    } catch (Exception e) {
        e.printStackTrace();
    }

    return prop;
}

// Get application URL
public static String getUrl() {

    if (prop == null) {
        loadConfig();
    }

    return prop.getProperty("url");
}

// Get username
public static String getUsername() {

    if (prop == null) {
        loadConfig();
    }

    return prop.getProperty("username");
}

// Get password
public static String getPassword() {

    if (prop == null) {
        loadConfig();
    }

    return prop.getProperty("password");
}

// Get resume path
public static String getResumePath() {

    if (prop == null) {
        loadConfig();
    }

    return prop.getProperty("resumePath");
}


}
