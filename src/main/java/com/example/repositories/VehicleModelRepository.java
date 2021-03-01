package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.VehicleModel;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
