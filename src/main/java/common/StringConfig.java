package common;

public class StringConfig {
    public final static String contentType = "application/x-www-form-urlencoded";
    public final static String colon = ":";
    public final static String GRANT_TYPE_REFRESH_TOKEN = "refresh_token";
    public final static String GRANT_TYPE_GET_TOKEN = "authorization_code";
    public final static String ISSUER = StringConfig.STG_ISSUER;
    public final static String STG_ISSUER = "https://stg-api.gmo-aozora.com";
    public final static String PROD_ISSUER = "https://api.gmo-aozora.com";
    public final static String AZP = "azp";
    public static final String NONCE = "nonce";

    public static final String BASE_ENDPOINT = StringConfig.STG_BASE_ENDPOINT;

    private static final String STG_BASE_ENDPOINT = "https://stg-api.gmo-aozora.com/ganb/api";
    private static final String PROD_BASE_ENDPOINT = "https://api.gmo-aozora.com/ganb/api";

    public static final String AUTH_PATH = "/auth/v1";
    public static final String PERSONAL_PATH = "/personal/v1";
    public static final String CORPORATE_PATH = "/corporation/v1";
    public static final String WEBHOOK_PATH = "/webhooks/v1";

}
