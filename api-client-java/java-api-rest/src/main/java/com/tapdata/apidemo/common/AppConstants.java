package com.tapdata.apidemo.common;

import com.tapdata.apidemo.utils.PropertiesUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppConstants {
    public static String CLIENT_ID = "5c0e750b7a5cd42464a5099d";
    public static String CLIENT_SECRET = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";

    private static String BASE_URL;
    private static String API_URL;

    static {
        buildBaseUrl();
        buildApiUrl();
    }

    public static final String TOKEN_URL = BASE_URL + "/oauth/token";
    public static final String FIN_CUSTOMER_URL = API_URL + "/api/v1/FIN_CUSTOMER";

    private static void buildBaseUrl() {
        BASE_URL = PropertiesUtils.getProperty("baseUrl", "config");
        if (BASE_URL == null) {
            log.error("Cannot find baseUrl config.");
        }
    }

    private static void buildApiUrl() {
        API_URL = PropertiesUtils.getProperty("apiUrl", "config");
        if (API_URL == null) {
            log.error("Cannot find apiUrl config.");
        }
    }
}