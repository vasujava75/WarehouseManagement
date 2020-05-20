package com.cogni.demo.service;

import com.cogni.demo.model.Vehicle;
import com.cogni.demo.model.VehicleDetails;
import com.cogni.demo.model.WarehousesBO;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WarehouseService {

    public List<VehicleDetails> getVehicles() {
        final List<WarehousesBO> warehousesBOSList = getWareHousesFromAnotherService();

        List<VehicleDetails> vehicleDetailsList = new ArrayList<>();
        for (WarehousesBO warehousesBO : warehousesBOSList) {
            if (warehousesBO.getCars().getVehicles() != null && warehousesBO.getCars().getVehicles().size() > 0) {
                for (Vehicle vehicle : warehousesBO.getCars().getVehicles()) {
                    VehicleDetails vehicleDetails = new VehicleDetails();
                    vehicleDetails.setId(vehicle.get_id());
                    vehicleDetails.setLicensed(vehicle.isLicensed());
                    vehicleDetails.setDate_added(vehicle.getDate_added());
                    vehicleDetails.setMake(vehicle.getMake());
                    vehicleDetails.setModel(vehicle.getModel());
                    vehicleDetails.setYear_model(vehicle.getYear_model());
                    vehicleDetails.setPrice(vehicle.getPrice());
                    vehicleDetails.setLat(warehousesBO.getLocation().getX());
                    vehicleDetails.setLang(warehousesBO.getLocation().getX());
                    vehicleDetails.setWareHouseName(warehousesBO.getName());
                    vehicleDetails.setWareHouseLocation(warehousesBO.getCars().getLocation());
                    vehicleDetailsList.add(vehicleDetails);
                }
            }
        }
        return vehicleDetailsList;
    }

    // ------------------------------------------------------------------
    // Logic to simulate Warehouses from another service
    // ------------------------------------------------------------------

    private List<WarehousesBO> getWareHousesFromAnotherService() {
        try {
            return getWarehousesFromFile("src/main/resources/warehouses.json");
        } catch (IOException e) {
            e.printStackTrace();
            return Arrays.asList();
        }
    }

    private static List<WarehousesBO> getWarehousesFromFile(final String pathName) throws IOException {
        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return Arrays.asList(new Gson().fromJson(new FileReader(pathName), WarehousesBO[].class));
    }

}
