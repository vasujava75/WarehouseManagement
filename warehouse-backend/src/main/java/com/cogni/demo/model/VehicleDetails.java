package com.cogni.demo.model;

import java.io.Serializable;

public class VehicleDetails implements Serializable {
    private int id;
    private String make;
    private String model;
    private int year_model;
    private double price;
    private boolean licensed;
    private String date_added;
    private String wareHouseName;
    private String wareHouseLocation;
    private String lat;
    private String lang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_model() {
        return year_model;
    }

    public void setYear_model(int year_model) {
        this.year_model = year_model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getWareHouseLocation() {
        return wareHouseLocation;
    }

    public void setWareHouseLocation(String wareHouseLocation) {
        this.wareHouseLocation = wareHouseLocation;
    }
}
