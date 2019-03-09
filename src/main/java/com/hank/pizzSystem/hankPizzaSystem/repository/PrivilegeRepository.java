package com.hank.pizzSystem.hankPizzaSystem.repository;



import com.hank.pizzSystem.hankPizzaSystem.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
  Privilege findByName(String name);
}
