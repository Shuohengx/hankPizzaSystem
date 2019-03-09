package com.hank.pizzSystem.hankPizzaSystem.repository;



import com.hank.pizzSystem.hankPizzaSystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByName(String name);
}
