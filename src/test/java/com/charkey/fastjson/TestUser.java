package com.charkey.fastjson;

/**
 * Created by Charkey on 12/7/2016.
 */
public class TestUser {

    String name;
    int age;
    boolean online;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", online=" + online +
                '}';
    }
}
