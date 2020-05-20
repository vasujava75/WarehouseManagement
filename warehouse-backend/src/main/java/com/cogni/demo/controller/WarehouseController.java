package com.cogni.demo.controller;

import com.cogni.demo.model.VehicleDetails;
import com.cogni.demo.service.WarehouseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/warehouses/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(final WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping()
    public List<VehicleDetails> getVehicles() {
        return warehouseService.getVehicles();
    }


}
