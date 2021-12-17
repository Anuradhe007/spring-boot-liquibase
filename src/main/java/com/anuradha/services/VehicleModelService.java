package com.anuradha.services;

import com.anuradha.entities.VehicleModel;

import java.util.stream.Stream;

public interface VehicleModelService {
    Stream<VehicleModel> getAllVehicleModels();
}
