package com.example.gsondemo;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxiaoyan on 2020/8/29.
 */
public class GsonDemo {
    private static final String TAG = "GsonDemo";
    private String name = "";
    private String hobby = "";
    private Map map = new HashMap();

    public GsonDemo() {

    }

    public GsonDemo(String name, String hobby, Map map) {
        this.name = name;
        this.hobby = hobby;
        this.map = map;
    }

    public void handleData(String name, String hobby, Map map) {
        this.name = name;
        this.hobby = hobby;
        this.map = map;
    }

    @Override
    public String toString() {
        return "GsonDemo{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
