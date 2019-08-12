package com.wywdgg.dzb.exception;

public abstract class CommonException extends RuntimeException {
    private static final long serialVersionUID = 1695507262854244171L;
    protected int errorCode;

    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(Throwable e) {
        super(e);
    }

    public CommonException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}