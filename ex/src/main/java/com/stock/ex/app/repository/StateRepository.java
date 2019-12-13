package com.stock.ex.app.repository;


import com.stock.ex.app.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface StateRepository extends JpaRepository<State,Integer> {

    Optional<State> findById(UUID id);
}
