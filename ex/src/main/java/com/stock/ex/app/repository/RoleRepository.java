package com.stock.ex.app.repository;

import java.util.Optional;

import com.stock.ex.app.model.user.Role;
import com.stock.ex.app.model.user.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}