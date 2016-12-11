package com.charkey.fastjson;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Charkey on 12/7/2016.
 */
public class TestJson {

    public static void main(String[] args) {
        String jsonString = "{\n" +
                "    \"age\": 25,\n" +
                "    \"name\": \"charkey\",\n" +
                "    \"online\": true/*this is comment*/\n" +
                "}";
        TestUser testUser = JSONObject.parseObject(jsonString, TestUser.class);
        System.out.println(testUser);
    }
}
