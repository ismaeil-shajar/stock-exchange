package com.stock.ex.app.repository;

import com.stock.ex.app.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<City,Integer> {
}
