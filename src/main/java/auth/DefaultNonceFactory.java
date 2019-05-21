package auth;

import common.NonceVerificationException;
import java.util.HashSet;
import java.util.Set;

public class DefaultNonceFactory extends NonceFactory {

    Set<String> nonceSet;

    public DefaultNonceFactory(String clientID, String clientSecret) {
        super(clientID, clientSecret);
        nonceSet = new HashSet<>();
    }

    @Override
    public void saveNonce(String nonce) {
        nonceSet.add(nonce);
    }

    @Override
    public void validateAndDeleteNonce(String nonce) {
        if (!nonceSet.contains(nonce)) {
            throw new NonceVerificationException();
        } else {
            nonceSet.remove(nonce);
        }
    }
}
