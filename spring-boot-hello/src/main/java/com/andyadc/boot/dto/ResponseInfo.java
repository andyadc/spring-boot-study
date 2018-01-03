package com.andyadc.boot.dto;

import java.io.Serializable;

/**
 * @author andy.an
 * @since 2018/1/3
 */
public class ResponseInfo<T> implements Serializable {

    private static final long serialVersionUID = 3346352172078978585L;

    private String code;
    private String message;
    private T data;

    public ResponseInfo() {
    }

    public ResponseInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseInfo{" +
                "code=" + code +
                ", message=" + message +
                ", data=" + data +
                "}";
    }
}
