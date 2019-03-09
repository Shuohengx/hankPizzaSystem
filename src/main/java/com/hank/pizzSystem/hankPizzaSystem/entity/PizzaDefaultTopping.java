package com.hank.pizzSystem.hankPizzaSystem.entity;



import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Topping;

import javax.persistence.*;
import java.util.List;


@Entity
public class PizzaDefaultTopping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private int quantity;

    @OneToMany
    private List<Topping> toppings;
}
