package com.hibernate.exception;

public class BizException extends RuntimeException {

    private String errCode;

    private String errMsg;

    public BizException() {
        super();
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
}
