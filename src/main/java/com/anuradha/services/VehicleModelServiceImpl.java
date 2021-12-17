package com.anuradha.services;

import com.anuradha.entities.VehicleModel;
import com.anuradha.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;

public class VehicleModelServiceImpl implements VehicleModelService {

    private VehicleModelRepository vehicleModelRepository;

    @Autowired
    public VehicleModelServiceImpl(VehicleModelRepository vehicleModelRepository) {
        this.vehicleModelRepository = vehicleModelRepository;
    }

    @Override
    public Stream<VehicleModel> getAllVehicleModels() {
        return vehicleModelRepository.findAll().parallelStream();
    }
}
