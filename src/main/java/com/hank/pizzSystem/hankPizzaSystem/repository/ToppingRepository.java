package com.hank.pizzSystem.hankPizzaSystem.repository;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Topping;
import com.hank.pizzSystem.hankPizzaSystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {

}
