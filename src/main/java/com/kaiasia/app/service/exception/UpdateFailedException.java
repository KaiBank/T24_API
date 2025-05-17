package com.kaiasia.app.service.exception;

public class UpdateFailedException extends CustomException {
    public UpdateFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateFailedException(Throwable cause) {
        super(cause);
    }
}
