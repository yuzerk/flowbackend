package com.flower.xin.common.exception;

public class ServiceException extends Exception {
    private String code;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String code, String message) {
        this(message);
        this.setCode(code);
    }

    public ServiceException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public ServiceException(String code, Throwable cause) {
        super(cause);
        this.setCode(code);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
