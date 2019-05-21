package auth;

import common.StringConfig;
import java.util.Base64;

public class AuthUtil {

    public static String getAuthorization(AuthTypeEnum authTypeEnum, String clientId, String clientSecret) {
        switch (authTypeEnum) {
            case CLIENT_SECRET_POST:
                return Base64.getEncoder().encodeToString((clientId + StringConfig.colon + clientSecret).getBytes());
            default:
                return null;
        }
    }
}
