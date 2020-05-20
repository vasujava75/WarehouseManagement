package com.cogni.demo.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    public static final String SERIALIZED_NAME_X = "lat";
    @SerializedName(SERIALIZED_NAME_X)
    private String x;

    public static final String SERIALIZED_NAME_Y = "long";
    @SerializedName(SERIALIZED_NAME_Y)
    private String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
