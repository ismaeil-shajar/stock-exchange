package com.stock.ex.app.repository;

import com.stock.ex.app.model.user.UserType;
import com.stock.ex.app.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users,Integer> {

    Optional<Users> findById(UUID id);
}
