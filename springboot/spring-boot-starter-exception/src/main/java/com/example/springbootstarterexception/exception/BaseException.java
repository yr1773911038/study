package com.example.springbootstarterexception.exception;

import com.example.springbootstarterexception.constant.Status;

public class BaseException extends RuntimeException{
    private int code;
    private String msg;

    public BaseException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseException(Status status) {
        this.code = status.getCode();
        this.msg = status.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
