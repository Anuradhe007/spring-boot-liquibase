package com.anuradha.services;

import com.anuradha.entities.VehicleBrand;

import java.util.stream.Stream;

public interface VehicleBrandService {
    Stream<VehicleBrand> getAllVehicleBrands();
}
