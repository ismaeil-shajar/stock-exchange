package com.stock.ex.app.repository;

import com.stock.ex.app.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
