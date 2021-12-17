package com.anuradha.services;

import com.anuradha.entities.VehicleBrand;
import com.anuradha.repositories.VehicleBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class VehicleBrandServiceImpl implements VehicleBrandService {

    private VehicleBrandRepository vehicleBrandRepository;

    @Autowired
    public VehicleBrandServiceImpl(VehicleBrandRepository vehicleBrandRepository) {
        this.vehicleBrandRepository = vehicleBrandRepository;
    }

    @Override
    public Stream<VehicleBrand> getAllVehicleBrands() {
        return vehicleBrandRepository.findAll().parallelStream();
    }

}
