package common;

import javax.validation.ValidationException;

public class AuthVerificationException extends ValidationException {

    public AuthVerificationException(String message) {
        super(message);
    }
}
