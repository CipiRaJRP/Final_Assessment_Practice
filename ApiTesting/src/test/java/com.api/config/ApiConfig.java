package com.api.config;

import com.api.data.Secrets;

public class ApiConfig {

    public ApiConfig() {
    }

    public static final String BASE_URL =
            Secrets.get("SHOPKART_BASE_URL");

    public static final String API_BASE_URL =
            Secrets.get("SHOPKART_API_BASE_URL");

    public static final String BROWSER =
            Secrets.get("BROWSER");

    public static final long TIMEOUT =
            Long.parseLong(
                    Secrets.get("UI_TIMEOUT_MS")
            );


}
