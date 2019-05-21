package auth;

import auth.model.TokenRequest;
import auth.model.TokenResponse;
import common.ApiException;
import common.IdTokenVerificationException;
import common.StateVerificationException;
import common.StringConfig;

public class OpenID {

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String scope;
    private StateFactory stateFactory;
    private AuthTypeEnum authTypeEnum;
    private AuthorizationApi authorizationApi;
    private TokenApi tokenApi;
    private NonceFactory nonceFactory;

    public OpenID(String clientId, String clientSecret, String redirectUri, String scope,
        AuthTypeEnum authTypeEnum, String hashKey, NonceFactory nonceFactory) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.scope = scope;
        this.authTypeEnum = authTypeEnum;
        this.stateFactory = new StateFactory(hashKey);
        if (nonceFactory == null) {
            this.nonceFactory = new DefaultNonceFactory(clientId, clientSecret);
        } else {
            this.nonceFactory = nonceFactory;
        }
        authorizationApi = new AuthorizationApi();
        tokenApi = new TokenApi();
    }

    public String authorizationGetUrl(String sessionId) throws ApiException {
        String state = stateFactory.generateState(sessionId);
        String nonce = nonceFactory.generatedNonce();
        return authorizationApi.authorizationGetUrl(
            clientId,
            redirectUri,
            "code",
            scope,
            state,
            nonce
        ).toString();
    }

    public TokenResponse getToken (String state, String code, String sessionId) throws ApiException, IdTokenVerificationException, StateVerificationException {
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
        TokenResponse response = tokenApi
            .tokenUsingPOST(StringConfig.contentType, tokenRequest,
                AuthUtil.getAuthorization(authTypeEnum, clientId, clientSecret));
        nonceFactory.validateIdToken(response.getIdToken());
        return response;
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
                AuthUtil.getAuthorization(authTypeEnum, clientId, clientSecret)
            );
    }





}
