package com.example.springbootstarterexception.exception;

import com.example.springbootstarterexception.constant.Status;

/**
 * 基于json
 */
public class JsonException extends BaseException {


    public JsonException(int code, String msg) {
        super(code, msg);
    }

    public JsonException(Status status) {
        super(status);
    }
}
