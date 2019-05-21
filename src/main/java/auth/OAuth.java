package auth;

import auth.model.TokenRequest;
import auth.model.TokenResponse;
import common.ApiException;
import common.StateVerificationException;
import common.StringConfig;
import java.net.URL;

public class OAuth {

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String scope;
    private StateFactory stateFactory;
    private AuthTypeEnum authTypeEnum;
    private AuthorizationApi authorizationApi;
    private TokenApi tokenApi;

    public OAuth(String clientId, String clientSecret, String redirectUri, String scope,
        AuthTypeEnum authTypeEnum, String hashKey) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.scope = scope;
        this.authTypeEnum = authTypeEnum;
        this.stateFactory = new StateFactory(hashKey);
        authorizationApi = new AuthorizationApi();
        tokenApi = new TokenApi();
    }

    public String authorizationGetUrl(String sessionId) throws ApiException {
        String state = stateFactory.generateState(sessionId);
        URL url = authorizationApi.authorizationGetUrl(
            clientId,
            redirectUri,
            "code",
            scope,
            state,
            null
        );
        return url.toString();
    }

    public TokenResponse getToken (String state, String code, String sessionId) throws ApiException, StateVerificationException {
        stateFactory.validateState(sessionId, state);
        TokenRequest tokenRequest = new TokenRequest();
        tokenRequest.setClientId(clientId);
        tokenRequest.setClientSecret(clientSecret);
        tokenRequest.setCode(code);
        tokenRequest.setGrantType(StringConfig.GRANT_TYPE_GET_TOKEN);
        tokenRequest.setRedirectUri(redirectUri);
        if (AuthTypeEnum.CLIENT_SECRET_POST == authTypeEnum) {
            tokenRequest.setClientId(clientId);
            tokenRequest.setClientSecret(clientSecret);
        }
        return tokenApi
            .tokenUsingPOST(StringConfig.contentType, tokenRequest,
                AuthUtil.getAuthorization(authTypeEnum, clientId, clientSecret));

    }

    public TokenResponse refreshToken (String refreshToken) throws ApiException {
        TokenRequest tokenRequest = new TokenRequest();
        tokenRequest.setClientId(clientId);
        tokenRequest.setClientSecret(clientSecret);
        tokenRequest.setGrantType(StringConfig.GRANT_TYPE_REFRESH_TOKEN);
        tokenRequest.setRefreshToken(refreshToken);
        if (AuthTypeEnum.CLIENT_SECRET_POST == authTypeEnum) {
            tokenRequest.setClientId(clientId);
            tokenRequest.setClientSecret(clientSecret);
        }
        return tokenApi
            .tokenUsingPOST(StringConfig.contentType, tokenRequest,
                AuthUtil.getAuthorization(authTypeEnum, clientId, clientSecret));
    }

}
