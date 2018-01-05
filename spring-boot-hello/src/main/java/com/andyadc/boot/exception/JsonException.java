package com.andyadc.boot.exception;

/**
 * @author andy.an
 * @since 2018/1/3
 */
public class JsonException extends RuntimeException {

    private static final long serialVersionUID = 5528535373583685274L;

    private String errorCode;
    private String errorMessage;

    public JsonException(String message) {
        this.errorMessage = message;
    }

    public JsonException(String message, Throwable cause) {
        super(cause);
        this.errorMessage = message;
    }

    public JsonException(String code, String message) {
        this.errorCode = code;
        this.errorMessage = message;
    }

    public JsonException(String code, String message, Throwable cause) {
        super(cause);
        this.errorCode = code;
        this.errorMessage = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
