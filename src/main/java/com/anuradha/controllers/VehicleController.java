package com.anuradha.controllers;

import com.anuradha.services.VehicleBrandService;
import com.anuradha.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    private VehicleBrandService vehicleBrandService;
    private VehicleModelService vehicleModelService;

    @Autowired
    public VehicleController(VehicleBrandService vehicleBrandService, VehicleModelService vehicleModelService) {
        this.vehicleBrandService = vehicleBrandService;
        this.vehicleModelService = vehicleModelService;
    }

    @GetMapping("/brands")
    public ResponseEntity<?> getVehicleBrands() {
        return new ResponseEntity<>(vehicleBrandService.getAllVehicleBrands(), HttpStatus.OK);
    }

    @GetMapping("/models")
    public ResponseEntity<?> getVehicleModels() {
        return new ResponseEntity<>(vehicleModelService.getAllVehicleModels(), HttpStatus.OK);
    }
}
