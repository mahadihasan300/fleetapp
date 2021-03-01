package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.State;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
