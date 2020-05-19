package com.example.springboot1;

public class TestEntity {
    private String hh;
    private String ww;

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public String getWw() {
        return ww;
    }

    public void setWw(String ww) {
        this.ww = ww;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "hh='" + hh + '\'' +
                ", ww='" + ww + '\'' +
                '}';
    }
}
