package common.auth;

import common.Pair;
import java.util.List;
import java.util.Map;

public class OpenIdAuth implements Authentication {

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken);
        }
    }
}
