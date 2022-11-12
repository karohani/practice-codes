package com.study.effective.java;

public class Staticfinal {
    public static String url;

    public Staticfinal(Property property) {
        url = property.getPath();
    }

    public static String getUrl() {
        return url;
    }
}
