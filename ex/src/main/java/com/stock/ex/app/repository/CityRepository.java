package com.stock.ex.app.repository;

import com.stock.ex.app.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CityRepository  extends JpaRepository<City,Integer> {

    Optional<City> findById(UUID id);

}
