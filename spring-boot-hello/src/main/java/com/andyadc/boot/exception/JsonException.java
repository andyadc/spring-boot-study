package com.andyadc.boot.exception;

/**
 * @author andy.an
 * @since 2018/1/3
 */
public class JsonException extends RuntimeException {

    private String code;
    private String message;

    public JsonException(String message) {
        super(message);
        this.message = message;
    }

    public JsonException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public JsonException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
