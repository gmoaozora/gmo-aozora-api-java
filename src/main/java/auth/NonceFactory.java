package auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import common.IdTokenVerificationException;
import common.NonceVerificationException;
import common.StringConfig;
import java.util.Map;
import java.util.UUID;

public abstract class NonceFactory {
    JWTVerifier verifier; //Reusable verifier instance

    public NonceFactory(String clientID, String clientSecret) {
        Algorithm algorithmHS = Algorithm.HMAC256(clientSecret);
        verifier = JWT.require(algorithmHS)
            .withIssuer(StringConfig.ISSUER)
            .withAudience(clientID)
            .acceptIssuedAt(600)
            .withClaim(StringConfig.AZP, clientID)
            .build();
    }

    public abstract void saveNonce(String nonce);

    public String generatedNonce() {
        UUID uuid = UUID.randomUUID();
        saveNonce(uuid.toString());
        return uuid.toString();
    }

    public abstract void validateAndDeleteNonce(String nonce) throws NonceVerificationException;

    public void validateIdToken(String idToken) {
        try {
            DecodedJWT jwt = verifier.verify(idToken);
            Map<String, Claim> claims = jwt.getClaims();    //Key is the Claim name
            Claim nonce = claims.get(StringConfig.NONCE);
            validateAndDeleteNonce(nonce.asString());
        } catch (JWTVerificationException | NonceVerificationException exception){
            throw new IdTokenVerificationException(exception.getMessage(), exception);
        }
    }

}
