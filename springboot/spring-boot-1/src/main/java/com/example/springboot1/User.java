package com.example.springboot1;

public class User {
    private String data1;
    private String fullName;

    @Override
    public String toString() {
        return "User{" +
                "data1='" + data1 + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
