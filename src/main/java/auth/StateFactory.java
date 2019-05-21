package auth;

import common.StateVerificationException;
import org.apache.commons.codec.digest.DigestUtils;

public class StateFactory {

    private String hashKey;

    public StateFactory(String hashKey) {
        this.hashKey = hashKey;
    }

    public String generateState(String sessionId) {
        return DigestUtils.sha256Hex(sessionId + hashKey);
    }

    public void validateState(String sessionId, String state) throws StateVerificationException {
        if (state == null || !state.equals(generateState(sessionId))) {
            throw new StateVerificationException();
        }
    }
}
