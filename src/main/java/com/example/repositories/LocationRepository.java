package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
