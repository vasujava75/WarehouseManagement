package com.cogni.demo.model;

import java.util.List;

public class Cars {
    private List<Vehicle> vehicles;
    private String location;
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
