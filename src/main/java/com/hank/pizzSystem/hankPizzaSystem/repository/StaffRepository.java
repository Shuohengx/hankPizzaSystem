package com.hank.pizzSystem.hankPizzaSystem.repository;



import com.hank.pizzSystem.hankPizzaSystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {
  Staff findByEmail(String email);

//  List<Staff> findByLastName(String lastName);
  List<Staff> findByLastName(String lastName);


}
