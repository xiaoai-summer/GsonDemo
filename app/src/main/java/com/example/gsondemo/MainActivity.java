package com.example.gsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map map = new HashMap();
        map.put("name", "xiaotian");
        GsonDemo gsonDemo = new GsonDemo();
        gsonDemo.handleData("xiaoai", "sport", map);
        Gson gson = new Gson();
        String json = gson.toJson(gsonDemo);
        Log.i(TAG, "json= " + json);


        JsonObject object = new JsonObject();
        object.addProperty("name", "xiaoai");
        object.addProperty("hobby", "sport");
        String s = object.toString();
        Log.i(TAG, "s= " + s);
    }
}