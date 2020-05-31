package com.example.springbootstarterexception.constant;

public enum  Status {
    OK(200,"访问成功"),
    FAIL(500,"服务器异常");
    private int code ;
    private String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
