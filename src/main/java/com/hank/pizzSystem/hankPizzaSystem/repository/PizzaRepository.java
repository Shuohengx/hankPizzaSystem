package com.hank.pizzSystem.hankPizzaSystem.repository;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
  //  Pizza findAll();



}
