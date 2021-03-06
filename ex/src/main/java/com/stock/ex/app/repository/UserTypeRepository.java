package com.stock.ex.app.repository;


import com.stock.ex.app.model.user.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
    Optional<UserType> findById(UUID id);
}
