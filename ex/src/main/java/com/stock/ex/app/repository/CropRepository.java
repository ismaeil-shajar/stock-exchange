package com.stock.ex.app.repository;

import com.stock.ex.app.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CropRepository   extends JpaRepository<Crop,Integer> {
    Optional<Crop> findById(UUID id);
}
