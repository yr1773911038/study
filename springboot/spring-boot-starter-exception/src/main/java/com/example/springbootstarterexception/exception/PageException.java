package com.example.springbootstarterexception.exception;

import com.example.springbootstarterexception.constant.Status;

public class PageException extends BaseException {

    public PageException(int code, String msg) {
        super(code, msg);
    }

    public PageException(Status status) {
        super(status);
    }
}
