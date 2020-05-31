package com.example.springbootstarterexception.model;

import com.example.springbootstarterexception.constant.Status;
import com.example.springbootstarterexception.exception.BaseException;

public class ApiResponse {
    private int code; //状态码
    private String message;//返回内容
    private String content;//返回数据

    private ApiResponse() {
    }

    private ApiResponse(int code, String message, String content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public static ApiResponse of(int code, String message, String content){
        return new ApiResponse(code,message,content);
    }

    public static <T extends BaseException>  ApiResponse ofException(T t){
        return of(t.getCode(),t.getMsg(),null);
    }

    public static <T extends BaseException>  ApiResponse ofSuccess(String data){
        return of(Status.OK.getCode(),Status.OK.getMessage(),data);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getContent() {
        return content;
    }
}
