package common;

import javax.validation.ValidationException;

public class IdTokenVerificationException extends ValidationException {

    public IdTokenVerificationException(String message, Throwable cause) {
        super(message, cause);
    }
}
